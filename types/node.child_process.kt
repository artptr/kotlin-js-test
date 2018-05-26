@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("child_process")
package child_process

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

external interface ChildProcess : events.internal.EventEmitter {
    var stdin: stream.internal.Writable
    var stdout: stream.internal.Readable
    var stderr: stream.internal.Readable
    var stdio: dynamic /* JsTuple<stream.internal.Writable, stream.internal.Readable, stream.internal.Readable> */
    var killed: Boolean
    var pid: Number
    fun kill(signal: String? = definedExternally /* null */)
    fun send(message: Any, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun send(message: Any, sendHandle: net.Socket? = definedExternally /* null */, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun send(message: Any, sendHandle: net.Server? = definedExternally /* null */, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun send(message: Any, sendHandle: net.Socket? = definedExternally /* null */, options: MessageOptions? = definedExternally /* null */, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean
    fun send(message: Any, sendHandle: net.Server? = definedExternally /* null */, options: MessageOptions? = definedExternally /* null */, callback: ((error: Error) -> Unit)? = definedExternally /* null */): Boolean
    var connected: Boolean
    fun disconnect()
    fun unref()
    fun ref()
    fun addListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "close" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun addListener(event: String /* "message" */, listener: (message: Any, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    override fun emit(event: String, vararg args: Any): Boolean
    override fun emit(event: Any?, vararg args: Any): Boolean
    fun emit(event: String /* "close" */, code: Number, signal: String): Boolean
    fun emit(event: String /* "disconnect" */): Boolean
    fun emit(event: String /* "error" */, err: Error): Boolean
    fun emit(event: String /* "exit" */, code: Number, signal: String): Boolean
    fun emit(event: String /* "message" */, message: Any, sendHandle: net.Socket): Boolean
    fun emit(event: String /* "message" */, message: Any, sendHandle: net.Server): Boolean
    fun on(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun on(event: String /* "close" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun on(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun on(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun on(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun on(event: String /* "message" */, listener: (message: Any, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    fun once(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun once(event: String /* "close" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun once(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun once(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun once(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun once(event: String /* "message" */, listener: (message: Any, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "close" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun prependListener(event: String /* "message" */, listener: (message: Any, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "close" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "disconnect" */, listener: () -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (err: Error) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "exit" */, listener: (code: Number, signal: String) -> Unit): ChildProcess /* this */
    fun prependOnceListener(event: String /* "message" */, listener: (message: Any, sendHandle: dynamic /* net.Socket | net.Server */) -> Unit): ChildProcess /* this */
    fun send(message: Any): Boolean
}
external interface MessageOptions {
    var keepOpen: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SpawnOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var stdio: Any? get() = definedExternally; set(value) = definedExternally
    var detached: Boolean? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var shell: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var windowsVerbatimArguments: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun spawn(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: SpawnOptions? = definedExternally /* null */): ChildProcess = definedExternally
external interface ExecOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var shell: String? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var maxBuffer: Number? get() = definedExternally; set(value) = definedExternally
    var killSignal: String? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ExecOptionsWithStringEncoding : ExecOptions {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external interface ExecOptionsWithBufferEncoding : ExecOptions {
    var encoding: String?
}
external fun exec(command: String, callback: ((error: Error?, stdout: String, stderr: String) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external interface `T$19` {
    var encoding: String? /* "buffer" */
}
external fun exec(command: String, options: `T$19` /* `T$19` & ExecOptions */, callback: ((error: Error?, stdout: Buffer, stderr: Buffer) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external interface `T$20` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external fun exec(command: String, options: `T$20` /* `T$20` & ExecOptions */, callback: ((error: Error?, stdout: String, stderr: String) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external interface `T$21` {
    var encoding: String
}
external fun exec(command: String, options: `T$21` /* `T$21` & ExecOptions */, callback: ((error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external fun exec(command: String, options: ExecOptions, callback: ((error: Error?, stdout: String, stderr: String) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external interface `T$22` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun exec(command: String, options: `T$22`? /* `T$22` & ExecOptions */, callback: ((error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): ChildProcess = definedExternally
external interface ExecFileOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var maxBuffer: Number? get() = definedExternally; set(value) = definedExternally
    var killSignal: String? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowsVerbatimArguments: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ExecFileOptionsWithStringEncoding : ExecFileOptions {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external interface ExecFileOptionsWithBufferEncoding : ExecFileOptions {
    var encoding: String? /* "buffer" */
}
external interface ExecFileOptionsWithOtherEncoding : ExecFileOptions {
    var encoding: String
}
external fun execFile(file: String): ChildProcess = definedExternally
external fun execFile(file: String, options: `T$22`? /* `T$22` & ExecFileOptions */): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>? = definedExternally /* null */): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: `T$22`? /* `T$22` & ExecFileOptions */): ChildProcess = definedExternally
external fun execFile(file: String, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, options: ExecFileOptionsWithBufferEncoding, callback: (error: Error?, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: ExecFileOptionsWithBufferEncoding, callback: (error: Error?, stdout: Buffer, stderr: Buffer) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, options: ExecFileOptionsWithStringEncoding, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: ExecFileOptionsWithStringEncoding, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, options: ExecFileOptionsWithOtherEncoding, callback: (error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: ExecFileOptionsWithOtherEncoding, callback: (error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, options: ExecFileOptions, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: ExecFileOptions, callback: (error: Error?, stdout: String, stderr: String) -> Unit): ChildProcess = definedExternally
external fun execFile(file: String, options: `T$22`? /* `T$22` & ExecFileOptions */, callback: ((error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)?): ChildProcess = definedExternally
external fun execFile(file: String, args: ReadonlyArray<String>?, options: `T$22`? /* `T$22` & ExecFileOptions */, callback: ((error: Error?, stdout: dynamic /* String | Buffer */, stderr: dynamic /* String | Buffer */) -> Unit)?): ChildProcess = definedExternally
external interface ForkOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var execPath: String? get() = definedExternally; set(value) = definedExternally
    var execArgv: Array<String>? get() = definedExternally; set(value) = definedExternally
    var silent: Boolean? get() = definedExternally; set(value) = definedExternally
    var stdio: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var windowsVerbatimArguments: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun fork(modulePath: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: ForkOptions? = definedExternally /* null */): ChildProcess = definedExternally
external interface SpawnSyncOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var input: dynamic /* String | Buffer */ get() = definedExternally; set(value) = definedExternally
    var stdio: Any? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var killSignal: String? get() = definedExternally; set(value) = definedExternally
    var maxBuffer: Number? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var shell: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
    var windowsVerbatimArguments: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface SpawnSyncOptionsWithStringEncoding : SpawnSyncOptions {
    override var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external interface SpawnSyncOptionsWithBufferEncoding : SpawnSyncOptions {
    override var encoding: String
}
external interface SpawnSyncReturns<T> {
    var pid: Number
    var output: Array<String>
    var stdout: T
    var stderr: T
    var status: Number
    var signal: String
    var error: Error
}
external fun spawnSync(command: String): SpawnSyncReturns<Buffer> = definedExternally
external fun spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding? = definedExternally /* null */): SpawnSyncReturns<String> = definedExternally
external fun spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding? = definedExternally /* null */): SpawnSyncReturns<Buffer> = definedExternally
external fun spawnSync(command: String, options: SpawnSyncOptions? = definedExternally /* null */): SpawnSyncReturns<Buffer> = definedExternally
external fun spawnSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: SpawnSyncOptionsWithStringEncoding? = definedExternally /* null */): SpawnSyncReturns<String> = definedExternally
external fun spawnSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: SpawnSyncOptionsWithBufferEncoding? = definedExternally /* null */): SpawnSyncReturns<Buffer> = definedExternally
external fun spawnSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: SpawnSyncOptions? = definedExternally /* null */): SpawnSyncReturns<Buffer> = definedExternally
external interface ExecSyncOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var input: dynamic /* String | Buffer */ get() = definedExternally; set(value) = definedExternally
    var stdio: Any? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var shell: String? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var killSignal: String? get() = definedExternally; set(value) = definedExternally
    var maxBuffer: Number? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ExecSyncOptionsWithStringEncoding : ExecSyncOptions {
    override var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external interface ExecSyncOptionsWithBufferEncoding : ExecSyncOptions {
    override var encoding: String
}
external fun execSync(command: String): Buffer = definedExternally
external fun execSync(command: String, options: ExecSyncOptionsWithStringEncoding? = definedExternally /* null */): String = definedExternally
external fun execSync(command: String, options: ExecSyncOptionsWithBufferEncoding? = definedExternally /* null */): Buffer = definedExternally
external fun execSync(command: String, options: ExecSyncOptions? = definedExternally /* null */): Buffer = definedExternally
external interface ExecFileSyncOptions {
    var cwd: String? get() = definedExternally; set(value) = definedExternally
    var input: dynamic /* String | Buffer */ get() = definedExternally; set(value) = definedExternally
    var stdio: Any? get() = definedExternally; set(value) = definedExternally
    var env: Any? get() = definedExternally; set(value) = definedExternally
    var uid: Number? get() = definedExternally; set(value) = definedExternally
    var gid: Number? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var killSignal: String? get() = definedExternally; set(value) = definedExternally
    var maxBuffer: Number? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var windowsHide: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface ExecFileSyncOptionsWithStringEncoding : ExecFileSyncOptions {
    override var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external interface ExecFileSyncOptionsWithBufferEncoding : ExecFileSyncOptions {
    override var encoding: String
}
external fun execFileSync(command: String): Buffer = definedExternally
external fun execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding? = definedExternally /* null */): String = definedExternally
external fun execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding? = definedExternally /* null */): Buffer = definedExternally
external fun execFileSync(command: String, options: ExecFileSyncOptions? = definedExternally /* null */): Buffer = definedExternally
external fun execFileSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: ExecFileSyncOptionsWithStringEncoding? = definedExternally /* null */): String = definedExternally
external fun execFileSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: ExecFileSyncOptionsWithBufferEncoding? = definedExternally /* null */): Buffer = definedExternally
external fun execFileSync(command: String, args: ReadonlyArray<String>? = definedExternally /* null */, options: ExecFileSyncOptions? = definedExternally /* null */): Buffer = definedExternally
external fun spawnSync(command: String): SpawnSyncReturns<Buffer> = definedExternally
external fun spawnSync(command: String): SpawnSyncReturns<String> = definedExternally
external fun execSync(command: String): Buffer = definedExternally
external fun execFileSync(command: String): Buffer = definedExternally
external fun execFileSync(command: String): String = definedExternally
