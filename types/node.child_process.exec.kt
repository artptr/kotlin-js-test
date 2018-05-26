@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("child_process") JsQualifier("exec")]
package child_process.exec

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

external interface `T$23` {
    var stdout: String
    var stderr: String
}
external fun __promisify__(command: String): Promise<`T$23`> = definedExternally
external interface `T$24` {
    var encoding: String? /* "buffer" */
}
external interface `T$25` {
    var stdout: Buffer
    var stderr: Buffer
}
external fun __promisify__(command: String, options: `T$24` /* `T$24` & child_process.ExecOptions */): Promise<`T$25`> = definedExternally
external interface `T$26` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external fun __promisify__(command: String, options: `T$26` /* `T$26` & child_process.ExecOptions */): Promise<`T$23`> = definedExternally
external fun __promisify__(command: String, options: child_process.ExecOptions): Promise<`T$23`> = definedExternally
external interface `T$27` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$28` {
    var stdout: dynamic /* String | Buffer */
    var stderr: dynamic /* String | Buffer */
}
external fun __promisify__(command: String, options: `T$27`? /* `T$27` & child_process.ExecOptions */ = definedExternally /* null */): Promise<`T$28`> = definedExternally
