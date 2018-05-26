@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("fs") JsQualifier("promises")]
package fs.promises

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

external interface `T$75` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flag: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$76`<TBuffer> {
    var bytesRead: Number
    var buffer: TBuffer
}
external interface `T$77` {
    var encoding: Nothing? get() = definedExternally; set(value) = definedExternally
    var flag: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$78` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
    var flag: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$79` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var flag: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$80`<TBuffer> {
    var bytesWritten: Number
    var buffer: TBuffer
}
external interface `T$81` {
    var bytesWritten: Number
    var buffer: String
}
external interface FileHandle {
    var fd: Number
    fun appendFile(data: Any, options: String? = definedExternally /* null */): Promise<Unit>
    fun appendFile(data: Any, options: `T$75`? = definedExternally /* null */): Promise<Unit>
    fun appendFile(data: Any, options: Nothing? = definedExternally /* null */): Promise<Unit>
    fun chown(uid: Number, gid: Number): Promise<Unit>
    fun chmod(mode: String): Promise<Unit>
    fun chmod(mode: Number): Promise<Unit>
    fun datasync(): Promise<Unit>
    fun sync(): Promise<Unit>
    fun <TBuffer : dynamic /* Buffer | Uint8Array */> read(buffer: TBuffer, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Promise<`T$76`<TBuffer>>
    fun readFile(options: `T$77`? = definedExternally /* null */): Promise<Buffer>
    fun readFile(options: String /* "ascii" */): Promise<String>
    fun readFile(options: String /* "utf8" */): Promise<String>
    fun readFile(options: String /* "utf16le" */): Promise<String>
    fun readFile(options: String /* "ucs2" */): Promise<String>
    fun readFile(options: String /* "base64" */): Promise<String>
    fun readFile(options: String /* "latin1" */): Promise<String>
    fun readFile(options: String /* "binary" */): Promise<String>
    fun readFile(options: String /* "hex" */): Promise<String>
    fun readFile(options: `T$78`): Promise<String>
    fun readFile(options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */>
    fun readFile(options: `T$79`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */>
    fun readFile(options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */>
    fun stat(): Promise<fs.Stats>
    fun truncate(len: Number? = definedExternally /* null */): Promise<Unit>
    fun utimes(atime: String, mtime: String): Promise<Unit>
    fun utimes(atime: String, mtime: Number): Promise<Unit>
    fun utimes(atime: String, mtime: Date): Promise<Unit>
    fun utimes(atime: Number, mtime: String): Promise<Unit>
    fun utimes(atime: Number, mtime: Number): Promise<Unit>
    fun utimes(atime: Number, mtime: Date): Promise<Unit>
    fun utimes(atime: Date, mtime: String): Promise<Unit>
    fun utimes(atime: Date, mtime: Number): Promise<Unit>
    fun utimes(atime: Date, mtime: Date): Promise<Unit>
    fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(buffer: TBuffer, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Promise<`T$80`<TBuffer>>
    fun write(data: Any, position: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Promise<`T$81`>
    fun writeFile(data: Any, options: String? = definedExternally /* null */): Promise<Unit>
    fun writeFile(data: Any, options: `T$75`? = definedExternally /* null */): Promise<Unit>
    fun writeFile(data: Any, options: Nothing? = definedExternally /* null */): Promise<Unit>
    fun close(): Promise<Unit>
    fun appendFile(data: Any): Promise<Unit>
    fun readFile(): Promise<dynamic /* String | Buffer */>
    fun writeFile(data: Any): Promise<Unit>
}
external fun access(path: String, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun access(path: Buffer, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun access(path: url.URL, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: String, dest: String, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: String, dest: Buffer, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: String, dest: url.URL, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: Buffer, dest: String, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: Buffer, dest: Buffer, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: Buffer, dest: url.URL, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: url.URL, dest: String, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: url.URL, dest: Buffer, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun copyFile(src: url.URL, dest: url.URL, flags: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun open(path: String, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun open(path: String, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun open(path: Buffer, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun open(path: Buffer, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun open(path: url.URL, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun open(path: url.URL, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Promise<FileHandle> = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> read(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Promise<`T$76`<TBuffer>> = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(handle: FileHandle, buffer: TBuffer, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Promise<`T$80`<TBuffer>> = definedExternally
external fun write(handle: FileHandle, string: Any, position: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Promise<`T$81`> = definedExternally
external fun rename(oldPath: String, newPath: String): Promise<Unit> = definedExternally
external fun rename(oldPath: String, newPath: Buffer): Promise<Unit> = definedExternally
external fun rename(oldPath: String, newPath: url.URL): Promise<Unit> = definedExternally
external fun rename(oldPath: Buffer, newPath: String): Promise<Unit> = definedExternally
external fun rename(oldPath: Buffer, newPath: Buffer): Promise<Unit> = definedExternally
external fun rename(oldPath: Buffer, newPath: url.URL): Promise<Unit> = definedExternally
external fun rename(oldPath: url.URL, newPath: String): Promise<Unit> = definedExternally
external fun rename(oldPath: url.URL, newPath: Buffer): Promise<Unit> = definedExternally
external fun rename(oldPath: url.URL, newPath: url.URL): Promise<Unit> = definedExternally
external fun truncate(path: String, len: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun truncate(path: Buffer, len: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun truncate(path: url.URL, len: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun ftruncate(handle: FileHandle, len: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rmdir(path: String): Promise<Unit> = definedExternally
external fun rmdir(path: Buffer): Promise<Unit> = definedExternally
external fun rmdir(path: url.URL): Promise<Unit> = definedExternally
external fun fdatasync(handle: FileHandle): Promise<Unit> = definedExternally
external fun fsync(handle: FileHandle): Promise<Unit> = definedExternally
external fun mkdir(path: String, mode: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun mkdir(path: String, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun mkdir(path: Buffer, mode: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun mkdir(path: Buffer, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun mkdir(path: url.URL, mode: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun mkdir(path: url.URL, mode: Number? = definedExternally /* null */): Promise<Unit> = definedExternally
external interface `T$82` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun readdir(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun readdir(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun readdir(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external interface `T$83` {
    var encoding: String /* "buffer" */
}
external fun readdir(path: String, options: String /* "buffer" */): Promise<Array<Buffer>> = definedExternally
external fun readdir(path: String, options: `T$83`): Promise<Array<Buffer>> = definedExternally
external fun readdir(path: Buffer, options: String /* "buffer" */): Promise<Array<Buffer>> = definedExternally
external fun readdir(path: Buffer, options: `T$83`): Promise<Array<Buffer>> = definedExternally
external fun readdir(path: url.URL, options: String /* "buffer" */): Promise<Array<Buffer>> = definedExternally
external fun readdir(path: url.URL, options: `T$83`): Promise<Array<Buffer>> = definedExternally
external interface `T$84` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun readdir(path: String, options: String? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: String, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: Buffer, options: String? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: Buffer, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: Buffer, options: Nothing? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: url.URL, options: String? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: url.URL, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: url.URL, options: Nothing? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readlink(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun readlink(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun readlink(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun readlink(path: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun readlink(path: String, options: `T$83`): Promise<Buffer> = definedExternally
external fun readlink(path: Buffer, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun readlink(path: Buffer, options: `T$83`): Promise<Buffer> = definedExternally
external fun readlink(path: url.URL, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun readlink(path: url.URL, options: `T$83`): Promise<Buffer> = definedExternally
external fun readlink(path: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: String, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: Buffer, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: Buffer, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: Buffer, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: url.URL, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: url.URL, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: url.URL, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun symlink(target: String, path: String, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: String, path: Buffer, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: String, path: url.URL, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: Buffer, path: String, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: Buffer, path: Buffer, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: Buffer, path: url.URL, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: url.URL, path: String, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: url.URL, path: Buffer, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun symlink(target: url.URL, path: url.URL, type: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun fstat(handle: FileHandle): Promise<fs.Stats> = definedExternally
external fun lstat(path: String): Promise<fs.Stats> = definedExternally
external fun lstat(path: Buffer): Promise<fs.Stats> = definedExternally
external fun lstat(path: url.URL): Promise<fs.Stats> = definedExternally
external fun stat(path: String): Promise<fs.Stats> = definedExternally
external fun stat(path: Buffer): Promise<fs.Stats> = definedExternally
external fun stat(path: url.URL): Promise<fs.Stats> = definedExternally
external fun link(existingPath: String, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: String, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: String, newPath: url.URL): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: Buffer, newPath: url.URL): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: String): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: Buffer): Promise<Unit> = definedExternally
external fun link(existingPath: url.URL, newPath: url.URL): Promise<Unit> = definedExternally
external fun unlink(path: String): Promise<Unit> = definedExternally
external fun unlink(path: Buffer): Promise<Unit> = definedExternally
external fun unlink(path: url.URL): Promise<Unit> = definedExternally
external fun fchmod(handle: FileHandle, mode: String): Promise<Unit> = definedExternally
external fun fchmod(handle: FileHandle, mode: Number): Promise<Unit> = definedExternally
external fun chmod(path: String, mode: String): Promise<Unit> = definedExternally
external fun chmod(path: String, mode: Number): Promise<Unit> = definedExternally
external fun chmod(path: Buffer, mode: String): Promise<Unit> = definedExternally
external fun chmod(path: Buffer, mode: Number): Promise<Unit> = definedExternally
external fun chmod(path: url.URL, mode: String): Promise<Unit> = definedExternally
external fun chmod(path: url.URL, mode: Number): Promise<Unit> = definedExternally
external fun lchmod(path: String, mode: String): Promise<Unit> = definedExternally
external fun lchmod(path: String, mode: Number): Promise<Unit> = definedExternally
external fun lchmod(path: Buffer, mode: String): Promise<Unit> = definedExternally
external fun lchmod(path: Buffer, mode: Number): Promise<Unit> = definedExternally
external fun lchmod(path: url.URL, mode: String): Promise<Unit> = definedExternally
external fun lchmod(path: url.URL, mode: Number): Promise<Unit> = definedExternally
external fun lchown(path: String, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun lchown(path: Buffer, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun lchown(path: url.URL, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun fchown(handle: FileHandle, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun chown(path: String, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun chown(path: Buffer, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun chown(path: url.URL, uid: Number, gid: Number): Promise<Unit> = definedExternally
external fun utimes(path: String, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: String, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: String, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: Buffer, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: Buffer, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: Buffer, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: url.URL, atime: String, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: url.URL, atime: Number, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun utimes(path: url.URL, atime: Date, mtime: dynamic /* String | Number | Date */): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: String, mtime: String): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: String, mtime: Number): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: String, mtime: Date): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Number, mtime: String): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Number, mtime: Number): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Number, mtime: Date): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Date, mtime: String): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Date, mtime: Number): Promise<Unit> = definedExternally
external fun futimes(handle: FileHandle, atime: Date, mtime: Date): Promise<Unit> = definedExternally
external fun realpath(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun realpath(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun realpath(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$82`? | Nothing? */ = definedExternally /* null */): Promise<String> = definedExternally
external fun realpath(path: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun realpath(path: String, options: `T$83`): Promise<Buffer> = definedExternally
external fun realpath(path: Buffer, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun realpath(path: Buffer, options: `T$83`): Promise<Buffer> = definedExternally
external fun realpath(path: url.URL, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun realpath(path: url.URL, options: `T$83`): Promise<Buffer> = definedExternally
external fun realpath(path: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: String, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: Buffer, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: Buffer, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: Buffer, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: url.URL, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: url.URL, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: url.URL, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "ascii" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "utf8" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "utf16le" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "ucs2" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "base64" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "latin1" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "binary" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String? /* "hex" */ = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: `T$82`? = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: Nothing? = definedExternally /* null */): Promise<String> = definedExternally
external fun mkdtemp(prefix: String, options: String /* "buffer" */): Promise<Buffer> = definedExternally
external fun mkdtemp(prefix: String, options: `T$83`): Promise<Buffer> = definedExternally
external fun mkdtemp(prefix: String, options: String? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun mkdtemp(prefix: String, options: `T$84`? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun mkdtemp(prefix: String, options: Nothing? = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun writeFile(path: String, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun writeFile(path: Buffer, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun writeFile(path: url.URL, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun writeFile(path: FileHandle, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun appendFile(path: String, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun appendFile(path: Buffer, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun appendFile(path: url.URL, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun appendFile(path: FileHandle, data: Any, options: dynamic /* String? | `T$75`? | Nothing? */ = definedExternally /* null */): Promise<Unit> = definedExternally
external fun readFile(path: String, options: `T$77`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun readFile(path: Buffer, options: `T$77`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun readFile(path: url.URL, options: `T$77`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun readFile(path: FileHandle, options: `T$77`? = definedExternally /* null */): Promise<Buffer> = definedExternally
external fun readFile(path: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$78` */): Promise<String> = definedExternally
external fun readFile(path: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$78` */): Promise<String> = definedExternally
external fun readFile(path: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$78` */): Promise<String> = definedExternally
external fun readFile(path: FileHandle, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$78` */): Promise<String> = definedExternally
external fun readFile(path: String, options: dynamic /* String? | `T$79`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readFile(path: Buffer, options: dynamic /* String? | `T$79`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readFile(path: url.URL, options: dynamic /* String? | `T$79`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readFile(path: FileHandle, options: dynamic /* String? | `T$79`? | Nothing? */ = definedExternally /* null */): Promise<dynamic /* String | Buffer */> = definedExternally
external fun mkdir(path: String): Promise<Unit> = definedExternally
external fun mkdir(path: Buffer): Promise<Unit> = definedExternally
external fun mkdir(path: url.URL): Promise<Unit> = definedExternally
external fun readdir(path: String): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: Buffer): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readdir(path: url.URL): Promise<dynamic /* Array<String> | Array<Buffer> */> = definedExternally
external fun readlink(path: String): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: Buffer): Promise<dynamic /* String | Buffer */> = definedExternally
external fun readlink(path: url.URL): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: String): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: Buffer): Promise<dynamic /* String | Buffer */> = definedExternally
external fun realpath(path: url.URL): Promise<dynamic /* String | Buffer */> = definedExternally
external fun mkdtemp(prefix: String): Promise<String> = definedExternally
external fun mkdtemp(prefix: String): Promise<dynamic /* String | Buffer */> = definedExternally
