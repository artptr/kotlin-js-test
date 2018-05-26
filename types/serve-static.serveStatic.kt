@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("serveStatic")
package serveStatic

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external var mime: dynamic /* "TypeQuery" kind unsupported yet here! (types/serve-static.d.ts:28:14 to 28:23) */ = definedExternally
external interface ServeStaticOptions {
    var cacheControl: Boolean? get() = definedExternally; set(value) = definedExternally
    var dotfiles: String? get() = definedExternally; set(value) = definedExternally
    var etag: Boolean? get() = definedExternally; set(value) = definedExternally
    var extensions: Array<String>? get() = definedExternally; set(value) = definedExternally
    var fallthrough: Boolean? get() = definedExternally; set(value) = definedExternally
    var immutable: Boolean? get() = definedExternally; set(value) = definedExternally
    var index: dynamic /* String | Boolean | Array<String> */ get() = definedExternally; set(value) = definedExternally
    var lastModified: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxAge: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var redirect: Boolean? get() = definedExternally; set(value) = definedExternally
    var setHeaders: ((res: express.Response, path: String, stat: Any) -> Any)? get() = definedExternally; set(value) = definedExternally
}
external fun serveStatic(root: String, options: ServeStaticOptions? = definedExternally /* null */): express.Handler = definedExternally
