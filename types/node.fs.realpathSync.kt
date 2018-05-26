@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("realpathSync")]
package fs.realpathSync

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

external interface `T$47` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun native(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$47`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun native(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$47`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun native(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$47`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external interface `T$48` {
    var encoding: String /* "buffer" */
}
external fun native(path: String, options: String /* "buffer" */): Buffer = definedExternally
external fun native(path: String, options: `T$48`): Buffer = definedExternally
external fun native(path: Buffer, options: String /* "buffer" */): Buffer = definedExternally
external fun native(path: Buffer, options: `T$48`): Buffer = definedExternally
external fun native(path: url.URL, options: String /* "buffer" */): Buffer = definedExternally
external fun native(path: url.URL, options: `T$48`): Buffer = definedExternally
external interface `T$49` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun native(path: String, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: String, options: `T$49`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: String, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: Buffer, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: Buffer, options: `T$49`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: Buffer, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: url.URL, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: url.URL, options: `T$49`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: url.URL, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun native(path: String): dynamic /* String | Buffer */ = definedExternally
external fun native(path: Buffer): dynamic /* String | Buffer */ = definedExternally
external fun native(path: url.URL): dynamic /* String | Buffer */ = definedExternally
