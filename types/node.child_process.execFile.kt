@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("child_process") JsQualifier("execFile")]
package child_process.execFile

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

external interface `T$29` {
    var stdout: String
    var stderr: String
}
external fun __promisify__(file: String): Promise<`T$29`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?): Promise<`T$29`> = definedExternally
external interface `T$30` {
    var stdout: Buffer
    var stderr: Buffer
}
external fun __promisify__(file: String, options: child_process.ExecFileOptionsWithBufferEncoding): Promise<`T$30`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?, options: child_process.ExecFileOptionsWithBufferEncoding): Promise<`T$30`> = definedExternally
external fun __promisify__(file: String, options: child_process.ExecFileOptionsWithStringEncoding): Promise<`T$29`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?, options: child_process.ExecFileOptionsWithStringEncoding): Promise<`T$29`> = definedExternally
external interface `T$31` {
    var stdout: dynamic /* String | Buffer */
    var stderr: dynamic /* String | Buffer */
}
external fun __promisify__(file: String, options: child_process.ExecFileOptionsWithOtherEncoding): Promise<`T$31`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?, options: child_process.ExecFileOptionsWithOtherEncoding): Promise<`T$31`> = definedExternally
external fun __promisify__(file: String, options: child_process.ExecFileOptions): Promise<`T$29`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?, options: child_process.ExecFileOptions): Promise<`T$29`> = definedExternally
external interface `T$32` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun __promisify__(file: String, options: `T$32`? /* `T$32` & child_process.ExecFileOptions */): Promise<`T$31`> = definedExternally
external fun __promisify__(file: String, args: Array<String>?, options: `T$32`? /* `T$32` & child_process.ExecFileOptions */): Promise<`T$31`> = definedExternally
