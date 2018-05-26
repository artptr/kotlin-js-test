@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

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

external var Console.Console: NodeJS.ConsoleConstructor get() = definedExternally; set(value) = definedExternally
external fun Console.assert(value: Any, message: String? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.clear(): Unit = definedExternally
external fun Console.count(label: String? = definedExternally /* null */): Unit = definedExternally
external fun Console.countReset(label: String? = definedExternally /* null */): Unit = definedExternally
external fun Console.debug(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.dir(obj: Any, options: NodeJS.InspectOptions? = definedExternally /* null */): Unit = definedExternally
external fun Console.dirxml(vararg data: Any): Unit = definedExternally
external fun Console.error(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.group(vararg label: Any): Unit = definedExternally
external fun Console.groupCollapsed(): Unit = definedExternally
external fun Console.groupEnd(): Unit = definedExternally
external fun Console.info(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.log(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.table(tabularData: Any, properties: Array<String>? = definedExternally /* null */): Unit = definedExternally
external fun Console.time(label: String? = definedExternally /* null */): Unit = definedExternally
external fun Console.timeEnd(label: String? = definedExternally /* null */): Unit = definedExternally
external fun Console.trace(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.warn(message: Any? = definedExternally /* null */, vararg optionalParams: Any): Unit = definedExternally
external fun Console.profile(label: String? = definedExternally /* null */): Unit = definedExternally
external fun Console.profileEnd(): Unit = definedExternally
external fun Console.timeStamp(label: String? = definedExternally /* null */): Unit = definedExternally
external var Error.stack: String? get() = definedExternally; set(value) = definedExternally
external fun ErrorConstructor.captureStackTrace(targetObject: Any, constructorOpt: Function<*>? = definedExternally /* null */): Unit = definedExternally
external var ErrorConstructor.prepareStackTrace: ((err: Error, stackTraces: Array<NodeJS.CallSite>) -> Any)? get() = definedExternally; set(value) = definedExternally
external var ErrorConstructor.stackTraceLimit: Number get() = definedExternally; set(value) = definedExternally
external interface MapConstructor
external interface WeakMapConstructor
external interface SetConstructor
external interface WeakSetConstructor
external interface Iterable<T>
external interface Iterator<T> {
    fun next(value: Any? = definedExternally /* null */): IteratorResult<T>
}
external interface IteratorResult<T>
external interface AsyncIterableIterator<T>
external interface SymbolConstructor {
    var iterator: Any?
    var asyncIterator: Any?
}
external var Symbol: SymbolConstructor = definedExternally
external fun String.trimLeft(): String = definedExternally
external fun String.trimRight(): String = definedExternally
@JsModule("process")
external val process: NodeJS.Process = definedExternally
external var global: NodeJS.Global = definedExternally
@JsModule("console")
external val console: Console = definedExternally
external var __filename: String = definedExternally
external var __dirname: String = definedExternally
external fun setTimeout(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): NodeJS.Timer = definedExternally
external fun clearTimeout(timeoutId: NodeJS.Timer): Unit = definedExternally
external fun setInterval(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): NodeJS.Timer = definedExternally
external fun clearInterval(intervalId: NodeJS.Timer): Unit = definedExternally
external fun setImmediate(callback: (args: Any) -> Unit, vararg args: Any): Any = definedExternally
external fun clearImmediate(immediateId: Any): Unit = definedExternally
external interface NodeRequireFunction {
    @nativeInvoke
    operator fun invoke(id: String): Any
}
external interface NodeRequire : NodeRequireFunction {
    var resolve: RequireResolve
    var cache: Any
    var extensions: NodeExtensions
    var main: NodeModule?
}
external interface `T$0` {
    var paths: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface RequireResolve {
    @nativeInvoke
    operator fun invoke(id: String, options: `T$0`? = definedExternally /* null */): String
    fun paths(request: String): Array<String>?
}
external interface NodeExtensions {
    @nativeGetter
    operator fun get(ext: String): ((m: NodeModule, filename: String) -> Any)?
    @nativeSetter
    operator fun set(ext: String, value: (m: NodeModule, filename: String) -> Any)
}
external var require: NodeRequire = definedExternally
external interface NodeModule {
    var exports: Any
    var require: NodeRequireFunction
    var id: String
    var filename: String
    var loaded: Boolean
    var parent: NodeModule?
    var children: Array<NodeModule>
    var paths: Array<String>
}
external var module: NodeModule = definedExternally
external var exports: Any = definedExternally
external object SlowBuffer {
    var prototype: Buffer = definedExternally
    fun isBuffer(obj: Any): Boolean = definedExternally
    fun byteLength(string: String, encoding: String? = definedExternally /* null */): Number = definedExternally
    fun concat(list: Array<Buffer>, totalLength: Number? = definedExternally /* null */): Buffer = definedExternally
}
external interface `T$1` {
    var type: String /* "Buffer" */
    var data: Array<Any>
}
external interface Buffer : Uint8Array {
    fun write(string: String, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun toString(encoding: String? = definedExternally /* null */, start: Number? = definedExternally /* null */, end: Number? = definedExternally /* null */): String
    fun toJSON(): `T$1`
    fun equals(otherBuffer: Buffer): Boolean
    fun compare(otherBuffer: Buffer, targetStart: Number? = definedExternally /* null */, targetEnd: Number? = definedExternally /* null */, sourceStart: Number? = definedExternally /* null */, sourceEnd: Number? = definedExternally /* null */): Number
    fun copy(targetBuffer: Buffer, targetStart: Number? = definedExternally /* null */, sourceStart: Number? = definedExternally /* null */, sourceEnd: Number? = definedExternally /* null */): Number
    override fun slice(start: Number?, end: Number?): Buffer
    fun writeUIntLE(value: Number, offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeUIntBE(value: Number, offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeIntLE(value: Number, offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeIntBE(value: Number, offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUIntLE(offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUIntBE(offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readIntLE(offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readIntBE(offset: Number, byteLength: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUInt8(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUInt16LE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUInt16BE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUInt32LE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readUInt32BE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readInt8(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readInt16LE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readInt16BE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readInt32LE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readInt32BE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readFloatLE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readFloatBE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readDoubleLE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun readDoubleBE(offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun swap16(): Buffer
    fun swap32(): Buffer
    fun swap64(): Buffer
    fun writeUInt8(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeUInt16LE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeUInt16BE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeUInt32LE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeUInt32BE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeInt8(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeInt16LE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeInt16BE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeInt32LE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeInt32BE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeFloatLE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeFloatBE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeDoubleLE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun writeDoubleBE(value: Number, offset: Number, noAssert: Boolean? = definedExternally /* null */): Number
    fun fill(value: Any, offset: Number? = definedExternally /* null */, end: Number? = definedExternally /* null */): Buffer /* this */
    fun indexOf(value: String, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun indexOf(value: Number, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun indexOf(value: Buffer, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun lastIndexOf(value: String, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun lastIndexOf(value: Number, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun lastIndexOf(value: Buffer, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Number
    fun entries(): IterableIterator<dynamic /* JsTuple<Number, Number> */>
    fun includes(value: String, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Boolean
    fun includes(value: Number, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Boolean
    fun includes(value: Buffer, byteOffset: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Boolean
    fun keys(): IterableIterator<Number>
    fun values(): IterableIterator<Number>
    companion object {
        var prototype: Buffer = definedExternally
        fun from(arrayBuffer: ArrayBuffer, byteOffset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): Buffer = definedExternally
        fun from(data: String): Buffer = definedExternally
        fun from(data: Array<Any>): Buffer = definedExternally
        fun from(data: Buffer): Buffer = definedExternally
        fun from(data: Uint8Array): Buffer = definedExternally
        fun from(data: ArrayBuffer): Buffer = definedExternally
        fun from(str: String, encoding: String? = definedExternally /* null */): Buffer = definedExternally
        fun isBuffer(obj: Any): Boolean = definedExternally
        fun isEncoding(encoding: String): Boolean = definedExternally
        fun byteLength(string: String, encoding: String? = definedExternally /* null */): Number = definedExternally
        fun byteLength(string: Buffer, encoding: String? = definedExternally /* null */): Number = definedExternally
        fun byteLength(string: ArrayBuffer, encoding: String? = definedExternally /* null */): Number = definedExternally
        fun byteLength(string: DataView, encoding: String? = definedExternally /* null */): Number = definedExternally
        fun concat(list: Array<Buffer>, totalLength: Number? = definedExternally /* null */): Buffer = definedExternally
        fun compare(buf1: Buffer, buf2: Buffer): Number = definedExternally
        fun alloc(size: Number, fill: String? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer = definedExternally
        fun alloc(size: Number, fill: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer = definedExternally
        fun alloc(size: Number, fill: Buffer? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer = definedExternally
        fun allocUnsafe(size: Number): Buffer = definedExternally
        fun allocUnsafeSlow(size: Number): Buffer = definedExternally
        var poolSize: Number = definedExternally
        fun alloc(size: Number): Buffer = definedExternally
    }
}
external interface IterableIterator<T>
