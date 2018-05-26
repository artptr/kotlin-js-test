@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("readlink")]
package fs.readlink

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

external interface `T$41` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$41`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$41`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$41`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external interface `T$42` {
    var encoding: String /* "buffer" */
}
external fun __promisify__(path: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: String, options: `T$42`): Promise<Buffer> = definedExternally
external fun __promisify__(path: Buffer, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: Buffer, options: `T$42`): Promise<Buffer> = definedExternally
external fun __promisify__(path: url.URL, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: url.URL, options: `T$42`): Promise<Buffer> = definedExternally
external interface `T$43` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: String, options: `T$43`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: `T$43`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: `T$43`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: String): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL): Promise<dynamic /* String | Buffer */> = definedExternally
