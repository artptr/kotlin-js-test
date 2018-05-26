@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("realpath")]
package fs.realpath

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

external interface `T$44` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$44`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$44`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun __promisify__(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$44`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external interface `T$45` {
    var encoding: String /* "buffer" */
}
external fun __promisify__(path: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: String, options: `T$45`): Promise<Buffer> = definedExternally
external fun __promisify__(path: Buffer, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: Buffer, options: `T$45`): Promise<Buffer> = definedExternally
external fun __promisify__(path: url.URL, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun __promisify__(path: url.URL, options: `T$45`): Promise<Buffer> = definedExternally
external interface `T$46` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(path: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: String, options: `T$46`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: `T$46`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: `T$46`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun native(path: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$44` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$44` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$44` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun native(path: String, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: String, options: `T$45`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: `T$45`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: `T$45`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun native(path: String, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: String, options: `T$46`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: `T$46`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: Buffer, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: `T$46`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: url.URL, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun native(path: String, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun native(path: Buffer, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun native(path: url.URL, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun __promisify__(path: String): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: Buffer): Promise<dynamic /* String | Buffer */> = definedExternally
external fun __promisify__(path: url.URL): Promise<dynamic /* String | Buffer */> = definedExternally
