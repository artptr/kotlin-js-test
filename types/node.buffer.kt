@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("buffer")
package buffer

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

external var INSPECT_MAX_BYTES: Number = definedExternally
external interface `T$7` {
    var prototype: Buffer
    fun from(arrayBuffer: ArrayBuffer, byteOffset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): Buffer
    fun from(data: String): Buffer
    fun from(data: Array<Any>): Buffer
    fun from(data: Buffer): Buffer
    fun from(data: Uint8Array): Buffer
    fun from(data: ArrayBuffer): Buffer
    fun from(str: String, encoding: String? = definedExternally /* null */): Buffer
    fun isBuffer(obj: Any): Boolean
    fun isEncoding(encoding: String): Boolean
    fun byteLength(string: String, encoding: String? = definedExternally /* null */): Number
    fun byteLength(string: Buffer, encoding: String? = definedExternally /* null */): Number
    fun byteLength(string: ArrayBuffer, encoding: String? = definedExternally /* null */): Number
    fun byteLength(string: DataView, encoding: String? = definedExternally /* null */): Number
    fun concat(list: Array<Buffer>, totalLength: Number? = definedExternally /* null */): Buffer
    fun compare(buf1: Buffer, buf2: Buffer): Number
    fun alloc(size: Number, fill: String? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer
    fun alloc(size: Number, fill: Number? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer
    fun alloc(size: Number, fill: Buffer? = definedExternally /* null */, encoding: String? = definedExternally /* null */): Buffer
    fun allocUnsafe(size: Number): Buffer
    fun allocUnsafeSlow(size: Number): Buffer
    var poolSize: Number
    fun alloc(size: Number): Buffer
}
external var BuffType: `T$7` = definedExternally
external interface `T$8` {
    var prototype: Buffer
    fun isBuffer(obj: Any): Boolean
    fun byteLength(string: String, encoding: String? = definedExternally /* null */): Number
    fun concat(list: Array<Buffer>, totalLength: Number? = definedExternally /* null */): Buffer
}
external var SlowBuffType: `T$8` = definedExternally
