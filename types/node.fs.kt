@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("fs")
package fs

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

external open class Stats {
    open fun isFile(): Boolean = definedExternally
    open fun isDirectory(): Boolean = definedExternally
    open fun isBlockDevice(): Boolean = definedExternally
    open fun isCharacterDevice(): Boolean = definedExternally
    open fun isSymbolicLink(): Boolean = definedExternally
    open fun isFIFO(): Boolean = definedExternally
    open fun isSocket(): Boolean = definedExternally
    open var dev: Number = definedExternally
    open var ino: Number = definedExternally
    open var mode: Number = definedExternally
    open var nlink: Number = definedExternally
    open var uid: Number = definedExternally
    open var gid: Number = definedExternally
    open var rdev: Number = definedExternally
    open var size: Number = definedExternally
    open var blksize: Number = definedExternally
    open var blocks: Number = definedExternally
    open var atimeMs: Number = definedExternally
    open var mtimeMs: Number = definedExternally
    open var ctimeMs: Number = definedExternally
    open var birthtimeMs: Number = definedExternally
    open var atime: Date = definedExternally
    open var mtime: Date = definedExternally
    open var ctime: Date = definedExternally
    open var birthtime: Date = definedExternally
}
external interface FSWatcher : events.internal.EventEmitter {
    fun close()
    fun addListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun addListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun addListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun on(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun on(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun on(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun once(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun once(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun once(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun prependListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun prependListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun prependListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String, listener: (args: Any) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String /* "change" */, listener: (eventType: String, filename: dynamic /* String | Buffer */) -> Unit): FSWatcher /* this */
    fun prependOnceListener(event: String /* "error" */, listener: (error: Error) -> Unit): FSWatcher /* this */
}
external open class ReadStream : stream.internal.Readable {
    open fun close(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open var bytesRead: Number = definedExternally
    open var path: dynamic /* String | Buffer */ = definedExternally
    open fun addListener(event: String, listener: (args: Any) -> Unit): ReadStream /* this */ = definedExternally
    open fun addListener(event: String /* "open" */, listener: (fd: Number) -> Unit): ReadStream /* this */ = definedExternally
    open fun addListener(event: String /* "close" */, listener: () -> Unit): ReadStream /* this */ = definedExternally
    open fun on(event: String, listener: (args: Any) -> Unit): ReadStream /* this */ = definedExternally
    open fun on(event: String /* "open" */, listener: (fd: Number) -> Unit): ReadStream /* this */ = definedExternally
    open fun on(event: String /* "close" */, listener: () -> Unit): ReadStream /* this */ = definedExternally
    open fun once(event: String, listener: (args: Any) -> Unit): ReadStream /* this */ = definedExternally
    open fun once(event: String /* "open" */, listener: (fd: Number) -> Unit): ReadStream /* this */ = definedExternally
    open fun once(event: String /* "close" */, listener: () -> Unit): ReadStream /* this */ = definedExternally
    open fun prependListener(event: String, listener: (args: Any) -> Unit): ReadStream /* this */ = definedExternally
    open fun prependListener(event: String /* "open" */, listener: (fd: Number) -> Unit): ReadStream /* this */ = definedExternally
    open fun prependListener(event: String /* "close" */, listener: () -> Unit): ReadStream /* this */ = definedExternally
    open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): ReadStream /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "open" */, listener: (fd: Number) -> Unit): ReadStream /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): ReadStream /* this */ = definedExternally
}
external open class WriteStream : stream.internal.Writable {
    open fun close(): Unit = definedExternally
    open var bytesWritten: Number = definedExternally
    open var path: dynamic /* String | Buffer */ = definedExternally
    open fun addListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */ = definedExternally
    open fun addListener(event: String /* "open" */, listener: (fd: Number) -> Unit): WriteStream /* this */ = definedExternally
    open fun addListener(event: String /* "close" */, listener: () -> Unit): WriteStream /* this */ = definedExternally
    open fun on(event: String, listener: (args: Any) -> Unit): WriteStream /* this */ = definedExternally
    open fun on(event: String /* "open" */, listener: (fd: Number) -> Unit): WriteStream /* this */ = definedExternally
    open fun on(event: String /* "close" */, listener: () -> Unit): WriteStream /* this */ = definedExternally
    open fun once(event: String, listener: (args: Any) -> Unit): WriteStream /* this */ = definedExternally
    open fun once(event: String /* "open" */, listener: (fd: Number) -> Unit): WriteStream /* this */ = definedExternally
    open fun once(event: String /* "close" */, listener: () -> Unit): WriteStream /* this */ = definedExternally
    open fun prependListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */ = definedExternally
    open fun prependListener(event: String /* "open" */, listener: (fd: Number) -> Unit): WriteStream /* this */ = definedExternally
    open fun prependListener(event: String /* "close" */, listener: () -> Unit): WriteStream /* this */ = definedExternally
    open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): WriteStream /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "open" */, listener: (fd: Number) -> Unit): WriteStream /* this */ = definedExternally
    open fun prependOnceListener(event: String /* "close" */, listener: () -> Unit): WriteStream /* this */ = definedExternally
}
external fun rename(oldPath: String, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: String, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: String, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: Buffer, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: Buffer, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: Buffer, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: url.URL, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: url.URL, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rename(oldPath: url.URL, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun renameSync(oldPath: String, newPath: String): Unit = definedExternally
external fun renameSync(oldPath: String, newPath: Buffer): Unit = definedExternally
external fun renameSync(oldPath: String, newPath: url.URL): Unit = definedExternally
external fun renameSync(oldPath: Buffer, newPath: String): Unit = definedExternally
external fun renameSync(oldPath: Buffer, newPath: Buffer): Unit = definedExternally
external fun renameSync(oldPath: Buffer, newPath: url.URL): Unit = definedExternally
external fun renameSync(oldPath: url.URL, newPath: String): Unit = definedExternally
external fun renameSync(oldPath: url.URL, newPath: Buffer): Unit = definedExternally
external fun renameSync(oldPath: url.URL, newPath: url.URL): Unit = definedExternally
external fun truncate(path: String, len: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncate(path: Buffer, len: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncate(path: url.URL, len: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncate(path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncate(path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncate(path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun truncateSync(path: String, len: Number? = definedExternally /* null */): Unit = definedExternally
external fun truncateSync(path: Buffer, len: Number? = definedExternally /* null */): Unit = definedExternally
external fun truncateSync(path: url.URL, len: Number? = definedExternally /* null */): Unit = definedExternally
external fun ftruncate(fd: Number, len: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun ftruncate(fd: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun ftruncateSync(fd: Number, len: Number? = definedExternally /* null */): Unit = definedExternally
external fun chown(path: String, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chown(path: Buffer, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chown(path: url.URL, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chownSync(path: String, uid: Number, gid: Number): Unit = definedExternally
external fun chownSync(path: Buffer, uid: Number, gid: Number): Unit = definedExternally
external fun chownSync(path: url.URL, uid: Number, gid: Number): Unit = definedExternally
external fun fchown(fd: Number, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun fchownSync(fd: Number, uid: Number, gid: Number): Unit = definedExternally
external fun lchown(path: String, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchown(path: Buffer, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchown(path: url.URL, uid: Number, gid: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchownSync(path: String, uid: Number, gid: Number): Unit = definedExternally
external fun lchownSync(path: Buffer, uid: Number, gid: Number): Unit = definedExternally
external fun lchownSync(path: url.URL, uid: Number, gid: Number): Unit = definedExternally
external fun chmod(path: String, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmod(path: String, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmod(path: Buffer, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmod(path: Buffer, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmod(path: url.URL, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmod(path: url.URL, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun chmodSync(path: String, mode: String): Unit = definedExternally
external fun chmodSync(path: String, mode: Number): Unit = definedExternally
external fun chmodSync(path: Buffer, mode: String): Unit = definedExternally
external fun chmodSync(path: Buffer, mode: Number): Unit = definedExternally
external fun chmodSync(path: url.URL, mode: String): Unit = definedExternally
external fun chmodSync(path: url.URL, mode: Number): Unit = definedExternally
external fun fchmod(fd: Number, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun fchmod(fd: Number, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun fchmodSync(fd: Number, mode: String): Unit = definedExternally
external fun fchmodSync(fd: Number, mode: Number): Unit = definedExternally
external fun lchmod(path: String, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmod(path: String, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmod(path: Buffer, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmod(path: Buffer, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmod(path: url.URL, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmod(path: url.URL, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun lchmodSync(path: String, mode: String): Unit = definedExternally
external fun lchmodSync(path: String, mode: Number): Unit = definedExternally
external fun lchmodSync(path: Buffer, mode: String): Unit = definedExternally
external fun lchmodSync(path: Buffer, mode: Number): Unit = definedExternally
external fun lchmodSync(path: url.URL, mode: String): Unit = definedExternally
external fun lchmodSync(path: url.URL, mode: Number): Unit = definedExternally
external fun stat(path: String, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun stat(path: Buffer, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun stat(path: url.URL, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun statSync(path: String): Stats = definedExternally
external fun statSync(path: Buffer): Stats = definedExternally
external fun statSync(path: url.URL): Stats = definedExternally
external fun fstat(fd: Number, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun fstatSync(fd: Number): Stats = definedExternally
external fun lstat(path: String, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun lstat(path: Buffer, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun lstat(path: url.URL, callback: (err: NodeJS.ErrnoException, stats: Stats) -> Unit): Unit = definedExternally
external fun lstatSync(path: String): Stats = definedExternally
external fun lstatSync(path: Buffer): Stats = definedExternally
external fun lstatSync(path: url.URL): Stats = definedExternally
external fun link(existingPath: String, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: String, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: String, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: Buffer, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: Buffer, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: Buffer, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: url.URL, newPath: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: url.URL, newPath: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun link(existingPath: url.URL, newPath: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun linkSync(existingPath: String, newPath: String): Unit = definedExternally
external fun linkSync(existingPath: String, newPath: Buffer): Unit = definedExternally
external fun linkSync(existingPath: String, newPath: url.URL): Unit = definedExternally
external fun linkSync(existingPath: Buffer, newPath: String): Unit = definedExternally
external fun linkSync(existingPath: Buffer, newPath: Buffer): Unit = definedExternally
external fun linkSync(existingPath: Buffer, newPath: url.URL): Unit = definedExternally
external fun linkSync(existingPath: url.URL, newPath: String): Unit = definedExternally
external fun linkSync(existingPath: url.URL, newPath: Buffer): Unit = definedExternally
external fun linkSync(existingPath: url.URL, newPath: url.URL): Unit = definedExternally
external fun symlink(target: String, path: String, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: String, path: Buffer, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: String, path: url.URL, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: String, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: Buffer, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: url.URL, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: String, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: Buffer, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: url.URL, type: String?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: String, path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: String, path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: String, path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: Buffer, path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlink(target: url.URL, path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun symlinkSync(target: String, path: String, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: String, path: Buffer, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: String, path: url.URL, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: Buffer, path: String, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: Buffer, path: Buffer, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: Buffer, path: url.URL, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: url.URL, path: String, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: url.URL, path: Buffer, type: String? = definedExternally /* null */): Unit = definedExternally
external fun symlinkSync(target: url.URL, path: url.URL, type: String? = definedExternally /* null */): Unit = definedExternally
external interface `T$38` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
}
external fun readlink(path: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external interface `T$39` {
    var encoding: String /* "buffer" */
}
external fun readlink(path: String, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external fun readlink(path: String, options: `T$39`, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: `T$39`, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: `T$39`, callback: (err: NodeJS.ErrnoException, linkString: Buffer) -> Unit): Unit = definedExternally
external interface `T$40` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
}
external fun readlink(path: String, options: String, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: String, options: `T$40`, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: String, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: `T$40`, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, options: Nothing?, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: String, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: `T$40`, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, options: Nothing?, callback: (err: NodeJS.ErrnoException, linkString: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readlink(path: String, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external fun readlink(path: Buffer, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external fun readlink(path: url.URL, callback: (err: NodeJS.ErrnoException, linkString: String) -> Unit): Unit = definedExternally
external fun readlinkSync(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun readlinkSync(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun readlinkSync(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun readlinkSync(path: String, options: String /* "buffer" */): Buffer = definedExternally
external fun readlinkSync(path: String, options: `T$39`): Buffer = definedExternally
external fun readlinkSync(path: Buffer, options: String /* "buffer" */): Buffer = definedExternally
external fun readlinkSync(path: Buffer, options: `T$39`): Buffer = definedExternally
external fun readlinkSync(path: url.URL, options: String /* "buffer" */): Buffer = definedExternally
external fun readlinkSync(path: url.URL, options: `T$39`): Buffer = definedExternally
external fun readlinkSync(path: String, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: String, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: String, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: Buffer, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: Buffer, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: Buffer, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: url.URL, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: url.URL, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: url.URL, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpath(path: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$38` | Nothing? */, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpath(path: String, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: String, options: `T$39`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: `T$39`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: `T$39`, callback: (err: NodeJS.ErrnoException, resolvedPath: Buffer) -> Unit): Unit = definedExternally
external fun realpath(path: String, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: String, options: `T$40`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: `T$40`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: String, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: `T$40`, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, options: Nothing?, callback: (err: NodeJS.ErrnoException, resolvedPath: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun realpath(path: String, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpath(path: Buffer, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpath(path: url.URL, callback: (err: NodeJS.ErrnoException, resolvedPath: String) -> Unit): Unit = definedExternally
external fun realpathSync(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun realpathSync(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun realpathSync(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$38`? | Nothing? */ = definedExternally /* null */): String = definedExternally
external fun realpathSync(path: String, options: String /* "buffer" */): Buffer = definedExternally
external fun realpathSync(path: String, options: `T$39`): Buffer = definedExternally
external fun realpathSync(path: Buffer, options: String /* "buffer" */): Buffer = definedExternally
external fun realpathSync(path: Buffer, options: `T$39`): Buffer = definedExternally
external fun realpathSync(path: url.URL, options: String /* "buffer" */): Buffer = definedExternally
external fun realpathSync(path: url.URL, options: `T$39`): Buffer = definedExternally
external fun realpathSync(path: String, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: String, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: String, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: Buffer, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: Buffer, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: Buffer, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: url.URL, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: url.URL, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: url.URL, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun unlink(path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun unlink(path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun unlink(path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun unlinkSync(path: String): Unit = definedExternally
external fun unlinkSync(path: Buffer): Unit = definedExternally
external fun unlinkSync(path: url.URL): Unit = definedExternally
external fun rmdir(path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rmdir(path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rmdir(path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun rmdirSync(path: String): Unit = definedExternally
external fun rmdirSync(path: Buffer): Unit = definedExternally
external fun rmdirSync(path: url.URL): Unit = definedExternally
external fun mkdir(path: String, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: String, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: Buffer, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: Buffer, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: url.URL, mode: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: url.URL, mode: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdir(path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun mkdirSync(path: String, mode: String? = definedExternally /* null */): Unit = definedExternally
external fun mkdirSync(path: String, mode: Number? = definedExternally /* null */): Unit = definedExternally
external fun mkdirSync(path: Buffer, mode: String? = definedExternally /* null */): Unit = definedExternally
external fun mkdirSync(path: Buffer, mode: Number? = definedExternally /* null */): Unit = definedExternally
external fun mkdirSync(path: url.URL, mode: String? = definedExternally /* null */): Unit = definedExternally
external fun mkdirSync(path: url.URL, mode: Number? = definedExternally /* null */): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "ascii" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "utf8" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "utf16le" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "ucs2" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "base64" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "latin1" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "binary" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "hex" */, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: `T$38`, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, folder: Buffer) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: `T$39`, callback: (err: NodeJS.ErrnoException, folder: Buffer) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: String, callback: (err: NodeJS.ErrnoException, folder: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: `T$40`, callback: (err: NodeJS.ErrnoException, folder: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, folder: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun mkdtemp(prefix: String, callback: (err: NodeJS.ErrnoException, folder: String) -> Unit): Unit = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "ascii" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "utf8" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "utf16le" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "ucs2" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "base64" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "latin1" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "binary" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String? /* "hex" */ = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: `T$38`? = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: Nothing? = definedExternally /* null */): String = definedExternally
external fun mkdtempSync(prefix: String, options: String /* "buffer" */): Buffer = definedExternally
external fun mkdtempSync(prefix: String, options: `T$39`): Buffer = definedExternally
external fun mkdtempSync(prefix: String, options: String? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun mkdtempSync(prefix: String, options: `T$40`? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun mkdtempSync(prefix: String, options: Nothing? = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external interface `T$53` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */
}
external fun readdir(path: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$53` | Nothing? */, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$53` | Nothing? */, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$53` | Nothing? */, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdir(path: String, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: String, options: `T$39`, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: `T$39`, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: String /* "buffer" */, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: `T$39`, callback: (err: NodeJS.ErrnoException, files: Array<Buffer>) -> Unit): Unit = definedExternally
external fun readdir(path: String, options: String, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: String, options: `T$40`, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: String, options: Nothing?, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: String, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: `T$40`, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, options: Nothing?, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: String, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: `T$40`, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, options: Nothing?, callback: (err: NodeJS.ErrnoException, files: dynamic /* Array<String> | Array<Buffer> */) -> Unit): Unit = definedExternally
external fun readdir(path: String, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdir(path: Buffer, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdir(path: url.URL, callback: (err: NodeJS.ErrnoException, files: Array<String>) -> Unit): Unit = definedExternally
external fun readdirSync(path: String, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$53`? | Nothing? */ = definedExternally /* null */): Array<String> = definedExternally
external fun readdirSync(path: Buffer, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$53`? | Nothing? */ = definedExternally /* null */): Array<String> = definedExternally
external fun readdirSync(path: url.URL, options: dynamic /* String? /* "ascii" */ | String? /* "utf8" */ | String? /* "utf16le" */ | String? /* "ucs2" */ | String? /* "base64" */ | String? /* "latin1" */ | String? /* "binary" */ | String? /* "hex" */ | `T$53`? | Nothing? */ = definedExternally /* null */): Array<String> = definedExternally
external fun readdirSync(path: String, options: String /* "buffer" */): Array<Buffer> = definedExternally
external fun readdirSync(path: String, options: `T$39`): Array<Buffer> = definedExternally
external fun readdirSync(path: Buffer, options: String /* "buffer" */): Array<Buffer> = definedExternally
external fun readdirSync(path: Buffer, options: `T$39`): Array<Buffer> = definedExternally
external fun readdirSync(path: url.URL, options: String /* "buffer" */): Array<Buffer> = definedExternally
external fun readdirSync(path: url.URL, options: `T$39`): Array<Buffer> = definedExternally
external fun readdirSync(path: String, options: String? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: String, options: `T$40`? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: String, options: Nothing? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: Buffer, options: String? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: Buffer, options: `T$40`? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: Buffer, options: Nothing? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: url.URL, options: String? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: url.URL, options: `T$40`? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: url.URL, options: Nothing? = definedExternally /* null */): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun close(fd: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun closeSync(fd: Number): Unit = definedExternally
external fun open(path: String, flags: String, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: String, flags: Number, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: Buffer, flags: String, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: Buffer, flags: Number, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: url.URL, flags: String, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: url.URL, flags: Number, mode: dynamic /* String | Number */, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: String, flags: String, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: String, flags: Number, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: Buffer, flags: String, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: Buffer, flags: Number, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: url.URL, flags: String, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun open(path: url.URL, flags: Number, callback: (err: NodeJS.ErrnoException, fd: Number) -> Unit): Unit = definedExternally
external fun openSync(path: String, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun openSync(path: String, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun openSync(path: Buffer, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun openSync(path: Buffer, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun openSync(path: url.URL, flags: String, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun openSync(path: url.URL, flags: Number, mode: dynamic /* String? | Number? */ = definedExternally /* null */): Number = definedExternally
external fun utimes(path: String, atime: String, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: String, atime: Number, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: String, atime: Date, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: Buffer, atime: String, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: Buffer, atime: Number, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: Buffer, atime: Date, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: url.URL, atime: String, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: url.URL, atime: Number, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimes(path: url.URL, atime: Date, mtime: dynamic /* String | Number | Date */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun utimesSync(path: String, atime: String, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: String, atime: Number, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: String, atime: Date, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: Buffer, atime: String, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: Buffer, atime: Number, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: Buffer, atime: Date, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: url.URL, atime: String, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: url.URL, atime: Number, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun utimesSync(path: url.URL, atime: Date, mtime: dynamic /* String | Number | Date */): Unit = definedExternally
external fun futimes(fd: Number, atime: String, mtime: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: String, mtime: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: String, mtime: Date, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Number, mtime: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Number, mtime: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Number, mtime: Date, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Date, mtime: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Date, mtime: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimes(fd: Number, atime: Date, mtime: Date, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun futimesSync(fd: Number, atime: String, mtime: String): Unit = definedExternally
external fun futimesSync(fd: Number, atime: String, mtime: Number): Unit = definedExternally
external fun futimesSync(fd: Number, atime: String, mtime: Date): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Number, mtime: String): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Number, mtime: Number): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Number, mtime: Date): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Date, mtime: String): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Date, mtime: Number): Unit = definedExternally
external fun futimesSync(fd: Number, atime: Date, mtime: Date): Unit = definedExternally
external fun fsync(fd: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun fsyncSync(fd: Number): Unit = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(fd: Number, buffer: TBuffer, offset: Number?, length: Number?, position: Number?, callback: (err: NodeJS.ErrnoException, written: Number, buffer: TBuffer) -> Unit): Unit = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(fd: Number, buffer: TBuffer, offset: Number?, length: Number?, callback: (err: NodeJS.ErrnoException, written: Number, buffer: TBuffer) -> Unit): Unit = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(fd: Number, buffer: TBuffer, offset: Number?, callback: (err: NodeJS.ErrnoException, written: Number, buffer: TBuffer) -> Unit): Unit = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> write(fd: Number, buffer: TBuffer, callback: (err: NodeJS.ErrnoException, written: Number, buffer: TBuffer) -> Unit): Unit = definedExternally
external fun write(fd: Number, string: Any, position: Number?, encoding: String?, callback: (err: NodeJS.ErrnoException, written: Number, str: String) -> Unit): Unit = definedExternally
external fun write(fd: Number, string: Any, position: Number?, callback: (err: NodeJS.ErrnoException, written: Number, str: String) -> Unit): Unit = definedExternally
external fun write(fd: Number, string: Any, callback: (err: NodeJS.ErrnoException, written: Number, str: String) -> Unit): Unit = definedExternally
external fun writeSync(fd: Number, buffer: Buffer, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Number = definedExternally
external fun writeSync(fd: Number, buffer: Uint8Array, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, position: Number? = definedExternally /* null */): Number = definedExternally
external fun writeSync(fd: Number, string: Any, position: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number = definedExternally
external fun <TBuffer : dynamic /* Buffer | Uint8Array */> read(fd: Number, buffer: TBuffer, offset: Number, length: Number, position: Number?, callback: ((err: NodeJS.ErrnoException, bytesRead: Number, buffer: TBuffer) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun readSync(fd: Number, buffer: Buffer, offset: Number, length: Number, position: Number?): Number = definedExternally
external fun readSync(fd: Number, buffer: Uint8Array, offset: Number, length: Number, position: Number?): Number = definedExternally
external interface `T$60` {
    var encoding: Nothing? get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun readFile(path: String, options: `T$60`?, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: Number, options: `T$60`?, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: Buffer, options: `T$60`?, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: url.URL, options: `T$60`?, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external interface `T$61` {
    var encoding: String
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun readFile(path: String, options: String, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: String, options: `T$61`, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: Number, options: String, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: Number, options: `T$61`, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: Buffer, options: String, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: Buffer, options: `T$61`, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: url.URL, options: String, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external fun readFile(path: url.URL, options: `T$61`, callback: (err: NodeJS.ErrnoException, data: String) -> Unit): Unit = definedExternally
external interface `T$62` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun readFile(path: String, options: dynamic /* String | `T$62` | Nothing? */, callback: (err: NodeJS.ErrnoException, data: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readFile(path: Number, options: dynamic /* String | `T$62` | Nothing? */, callback: (err: NodeJS.ErrnoException, data: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readFile(path: Buffer, options: dynamic /* String | `T$62` | Nothing? */, callback: (err: NodeJS.ErrnoException, data: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readFile(path: url.URL, options: dynamic /* String | `T$62` | Nothing? */, callback: (err: NodeJS.ErrnoException, data: dynamic /* String | Buffer */) -> Unit): Unit = definedExternally
external fun readFile(path: String, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: Number, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: Buffer, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFile(path: url.URL, callback: (err: NodeJS.ErrnoException, data: Buffer) -> Unit): Unit = definedExternally
external fun readFileSync(path: String, options: `T$60`? = definedExternally /* null */): Buffer = definedExternally
external fun readFileSync(path: Number, options: `T$60`? = definedExternally /* null */): Buffer = definedExternally
external fun readFileSync(path: Buffer, options: `T$60`? = definedExternally /* null */): Buffer = definedExternally
external fun readFileSync(path: url.URL, options: `T$60`? = definedExternally /* null */): Buffer = definedExternally
external fun readFileSync(path: String, options: String): String = definedExternally
external fun readFileSync(path: String, options: `T$61`): String = definedExternally
external fun readFileSync(path: Number, options: String): String = definedExternally
external fun readFileSync(path: Number, options: `T$61`): String = definedExternally
external fun readFileSync(path: Buffer, options: String): String = definedExternally
external fun readFileSync(path: Buffer, options: `T$61`): String = definedExternally
external fun readFileSync(path: url.URL, options: String): String = definedExternally
external fun readFileSync(path: url.URL, options: `T$61`): String = definedExternally
external fun readFileSync(path: String, options: dynamic /* String? | `T$62`? | Nothing? */ = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readFileSync(path: Number, options: dynamic /* String? | `T$62`? | Nothing? */ = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readFileSync(path: Buffer, options: dynamic /* String? | `T$62`? | Nothing? */ = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external fun readFileSync(path: url.URL, options: dynamic /* String? | `T$62`? | Nothing? */ = definedExternally /* null */): dynamic /* String | Buffer */ = definedExternally
external interface `T$66` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var mode: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var flag: String? get() = definedExternally; set(value) = definedExternally
}
external fun writeFile(path: String, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: Number, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: Buffer, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: url.URL, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: String, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: Number, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: Buffer, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFile(path: url.URL, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun writeFileSync(path: String, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun writeFileSync(path: Number, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun writeFileSync(path: Buffer, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun writeFileSync(path: url.URL, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun appendFile(file: String, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: Number, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: Buffer, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: url.URL, data: Any, options: dynamic /* String | `T$66` | Nothing? */, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: String, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: Number, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: Buffer, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFile(file: url.URL, data: Any, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun appendFileSync(file: String, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun appendFileSync(file: Number, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun appendFileSync(file: Buffer, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external fun appendFileSync(file: url.URL, data: Any, options: dynamic /* String? | `T$66`? | Nothing? */ = definedExternally /* null */): Unit = definedExternally
external interface `T$69` {
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var interval: Number? get() = definedExternally; set(value) = definedExternally
}
external fun watchFile(filename: String, options: `T$69`?, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun watchFile(filename: Buffer, options: `T$69`?, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun watchFile(filename: url.URL, options: `T$69`?, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun watchFile(filename: String, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun watchFile(filename: Buffer, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun watchFile(filename: url.URL, listener: (curr: Stats, prev: Stats) -> Unit): Unit = definedExternally
external fun unwatchFile(filename: String, listener: ((curr: Stats, prev: Stats) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun unwatchFile(filename: Buffer, listener: ((curr: Stats, prev: Stats) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external fun unwatchFile(filename: url.URL, listener: ((curr: Stats, prev: Stats) -> Unit)? = definedExternally /* null */): Unit = definedExternally
external interface `T$70` {
    var encoding: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ */ get() = definedExternally; set(value) = definedExternally
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var recursive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun watch(filename: String, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$70` | Nothing? */, listener: ((event: String, filename: String) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$70` | Nothing? */, listener: ((event: String, filename: String) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: dynamic /* String /* "ascii" */ | String /* "utf8" */ | String /* "utf16le" */ | String /* "ucs2" */ | String /* "base64" */ | String /* "latin1" */ | String /* "binary" */ | String /* "hex" */ | `T$70` | Nothing? */, listener: ((event: String, filename: String) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external interface `T$71` {
    var encoding: String /* "buffer" */
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var recursive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun watch(filename: String, options: String /* "buffer" */, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: String, options: `T$71`, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: String /* "buffer" */, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: `T$71`, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: String /* "buffer" */, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: `T$71`, listener: ((event: String, filename: Buffer) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external interface `T$72` {
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var persistent: Boolean? get() = definedExternally; set(value) = definedExternally
    var recursive: Boolean? get() = definedExternally; set(value) = definedExternally
}
external fun watch(filename: String, options: String, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: String, options: `T$72`, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: String, options: Nothing?, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: String, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: `T$72`, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, options: Nothing?, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: String, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: `T$72`, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, options: Nothing?, listener: ((event: String, filename: dynamic /* String | Buffer */) -> Unit)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: String, listener: ((event: String, filename: String) -> Any)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: Buffer, listener: ((event: String, filename: String) -> Any)? = definedExternally /* null */): FSWatcher = definedExternally
external fun watch(filename: url.URL, listener: ((event: String, filename: String) -> Any)? = definedExternally /* null */): FSWatcher = definedExternally
external fun exists(path: String, callback: (exists: Boolean) -> Unit): Unit = definedExternally
external fun exists(path: Buffer, callback: (exists: Boolean) -> Unit): Unit = definedExternally
external fun exists(path: url.URL, callback: (exists: Boolean) -> Unit): Unit = definedExternally
external fun existsSync(path: String): Boolean = definedExternally
external fun existsSync(path: Buffer): Boolean = definedExternally
external fun existsSync(path: url.URL): Boolean = definedExternally
external fun access(path: String, mode: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun access(path: Buffer, mode: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun access(path: url.URL, mode: Number?, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun access(path: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun access(path: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun access(path: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun accessSync(path: String, mode: Number? = definedExternally /* null */): Unit = definedExternally
external fun accessSync(path: Buffer, mode: Number? = definedExternally /* null */): Unit = definedExternally
external fun accessSync(path: url.URL, mode: Number? = definedExternally /* null */): Unit = definedExternally
external interface `T$73` {
    var flags: String? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var fd: Number? get() = definedExternally; set(value) = definedExternally
    var mode: Number? get() = definedExternally; set(value) = definedExternally
    var autoClose: Boolean? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var highWaterMark: Number? get() = definedExternally; set(value) = definedExternally
}
external fun createReadStream(path: String, options: String? = definedExternally /* null */): ReadStream = definedExternally
external fun createReadStream(path: String, options: `T$73`? = definedExternally /* null */): ReadStream = definedExternally
external fun createReadStream(path: Buffer, options: String? = definedExternally /* null */): ReadStream = definedExternally
external fun createReadStream(path: Buffer, options: `T$73`? = definedExternally /* null */): ReadStream = definedExternally
external fun createReadStream(path: url.URL, options: String? = definedExternally /* null */): ReadStream = definedExternally
external fun createReadStream(path: url.URL, options: `T$73`? = definedExternally /* null */): ReadStream = definedExternally
external interface `T$74` {
    var flags: String? get() = definedExternally; set(value) = definedExternally
    var encoding: String? get() = definedExternally; set(value) = definedExternally
    var fd: Number? get() = definedExternally; set(value) = definedExternally
    var mode: Number? get() = definedExternally; set(value) = definedExternally
    var autoClose: Boolean? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
}
external fun createWriteStream(path: String, options: String? = definedExternally /* null */): WriteStream = definedExternally
external fun createWriteStream(path: String, options: `T$74`? = definedExternally /* null */): WriteStream = definedExternally
external fun createWriteStream(path: Buffer, options: String? = definedExternally /* null */): WriteStream = definedExternally
external fun createWriteStream(path: Buffer, options: `T$74`? = definedExternally /* null */): WriteStream = definedExternally
external fun createWriteStream(path: url.URL, options: String? = definedExternally /* null */): WriteStream = definedExternally
external fun createWriteStream(path: url.URL, options: `T$74`? = definedExternally /* null */): WriteStream = definedExternally
external fun fdatasync(fd: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun fdatasyncSync(fd: Number): Unit = definedExternally
external fun copyFile(src: String, dest: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: String, dest: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: String, dest: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: String, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: Buffer, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: url.URL, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: String, dest: String, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: String, dest: Buffer, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: String, dest: url.URL, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: String, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: Buffer, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: Buffer, dest: url.URL, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: String, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: Buffer, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFile(src: url.URL, dest: url.URL, flags: Number, callback: (err: NodeJS.ErrnoException) -> Unit): Unit = definedExternally
external fun copyFileSync(src: String, dest: String, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: String, dest: Buffer, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: String, dest: url.URL, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: Buffer, dest: String, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: Buffer, dest: Buffer, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: Buffer, dest: url.URL, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: url.URL, dest: String, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: url.URL, dest: Buffer, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun copyFileSync(src: url.URL, dest: url.URL, flags: Number? = definedExternally /* null */): Unit = definedExternally
external fun readlinkSync(path: String): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: Buffer): dynamic /* String | Buffer */ = definedExternally
external fun readlinkSync(path: url.URL): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: String): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: Buffer): dynamic /* String | Buffer */ = definedExternally
external fun realpathSync(path: url.URL): dynamic /* String | Buffer */ = definedExternally
external fun mkdirSync(path: String): Unit = definedExternally
external fun mkdirSync(path: Buffer): Unit = definedExternally
external fun mkdirSync(path: url.URL): Unit = definedExternally
external fun mkdtempSync(prefix: String): String = definedExternally
external fun mkdtempSync(prefix: String): dynamic /* String | Buffer */ = definedExternally
external fun readdirSync(path: String): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: Buffer): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun readdirSync(path: url.URL): dynamic /* Array<String> | Array<Buffer> */ = definedExternally
external fun createReadStream(path: String): ReadStream = definedExternally
external fun createReadStream(path: Buffer): ReadStream = definedExternally
external fun createReadStream(path: url.URL): ReadStream = definedExternally
external fun createWriteStream(path: String): WriteStream = definedExternally
external fun createWriteStream(path: Buffer): WriteStream = definedExternally
external fun createWriteStream(path: url.URL): WriteStream = definedExternally
