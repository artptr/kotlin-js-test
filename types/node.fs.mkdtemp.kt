@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("mkdtemp")]
package fs.mkdtemp

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

external interface `T$50` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(prefix: String, options: String? /* "ascii" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "utf8" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "utf16le" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "ucs2" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "base64" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "latin1" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "binary" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: String? /* "hex" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: `T$50`? = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(prefix: String, options: Nothing? = definedExternally /* null */): Promise<String> = definedExternally
external interface `T$51` {
    var encoding: String /* "buffer" */
}
external fun __promisify__(prefix: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(prefix: String, options: `T$51`): Promise<Buffer> = definedExternally
external interface `T$52` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(prefix: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(prefix: String, options: `T$52`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(prefix: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(prefix: String): Promise<String> = definedExternally
external fun __promisify__(prefix: String): Promise<dynamic /* String | Buffer */> = definedExternally
