@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("writeFile")]
package fs.writeFile

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

external interface `T$67` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, data: Any, options: dynamic /* String? | `T$67`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun __promisify__(path: Number, data: Any, options: dynamic /* String? | `T$67`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun __promisify__(path: Buffer, data: Any, options: dynamic /* String? | `T$67`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun __promisify__(path: url.URL, data: Any, options: dynamic /* String? | `T$67`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
