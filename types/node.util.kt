@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("util")
package util

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

external interface InspectOptions : NodeJS.InspectOptions
external fun format(format: Any, vararg param: Any): String = definedExternally
external fun debug(string: String): Unit = definedExternally
external fun error(vararg param: Any): Unit = definedExternally
external fun puts(vararg param: Any): Unit = definedExternally
external fun print(vararg param: Any): Unit = definedExternally
external fun log(string: String): Unit = definedExternally
external interface `T$92` {
    @nativeGetter
    operator fun get(color: String): dynamic /* JsTuple<Number, Number> */
    @nativeSetter
    operator fun set(color: String, value: dynamic /* JsTuple<Number, Number> */)
}
external interface `T$93` {
    @nativeGetter
    operator fun get(style: String): String?
    @nativeSetter
    operator fun set(style: String, value: String?)
}
external object inspect {
    @nativeInvoke
    operator fun invoke(`object`: Any, showHidden: Boolean? = definedExternally /* null */, depth: Number? = definedExternally /* null */, color: Boolean? = definedExternally /* null */): String
    @nativeInvoke
    operator fun invoke(`object`: Any, options: InspectOptions): String
    var colors: `T$92` = definedExternally
    var styles: `T$93` = definedExternally
    var defaultOptions: InspectOptions = definedExternally
    var custom: Any? = definedExternally
}
external fun isArray(`object`: Any): Boolean = definedExternally
external fun isRegExp(`object`: Any): Boolean = definedExternally
external fun isDate(`object`: Any): Boolean = definedExternally
external fun isError(`object`: Any): Boolean = definedExternally
external fun inherits(constructor: Any, superConstructor: Any): Unit = definedExternally
external fun debuglog(key: String): (msg: String, param: Any) -> Unit = definedExternally
external fun isBoolean(`object`: Any): Boolean = definedExternally
external fun isBuffer(`object`: Any): Boolean = definedExternally
external fun isFunction(`object`: Any): Boolean = definedExternally
external fun isNull(`object`: Any): Boolean = definedExternally
external fun isNullOrUndefined(`object`: Any): Boolean = definedExternally
external fun isNumber(`object`: Any): Boolean = definedExternally
external fun isObject(`object`: Any): Boolean = definedExternally
external fun isPrimitive(`object`: Any): Boolean = definedExternally
external fun isString(`object`: Any): Boolean = definedExternally
external fun isSymbol(`object`: Any): Boolean = definedExternally
external fun isUndefined(`object`: Any): Boolean = definedExternally
external fun <T : Function<*>> deprecate(fn: T, message: String): T = definedExternally
external fun isDeepStrictEqual(val1: Any, val2: Any): Boolean = definedExternally
external interface CustomPromisify<TCustom : Function<*>> : Function<*> {
    var __promisify__: TCustom
}
external fun callbackify(fn: () -> Promise<Unit>): (callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <TResult> callbackify(fn: () -> Promise<TResult>): (callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1> callbackify(fn: (arg1: T1) -> Promise<Unit>): (arg1: T1, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, TResult> callbackify(fn: (arg1: T1) -> Promise<TResult>): (arg1: T1, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1, T2> callbackify(fn: (arg1: T1, arg2: T2) -> Promise<Unit>): (arg1: T1, arg2: T2, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, T2, TResult> callbackify(fn: (arg1: T1, arg2: T2) -> Promise<TResult>): (arg1: T1, arg2: T2, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3) -> Promise<Unit>): (arg1: T1, arg2: T2, arg3: T3, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<Unit>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4, T5> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<Unit>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4, T5, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4, T5, T6> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6) -> Promise<Unit>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, callback: (err: NodeJS.ErrnoException) -> Unit) -> Unit = definedExternally
external fun <T1, T2, T3, T4, T5, T6, TResult> callbackify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6) -> Promise<TResult>): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, callback: (err: NodeJS.ErrnoException, result: TResult) -> Unit) -> Unit = definedExternally
external fun <TCustom : Function<*>> promisify(fn: CustomPromisify<TCustom>): TCustom = definedExternally
external fun <TResult> promisify(fn: (callback: (err: Error?, result: TResult) -> Unit) -> Unit): () -> Promise<TResult> = definedExternally
external fun promisify(fn: (callback: (err: Error?) -> Unit) -> Unit): () -> Promise<Unit> = definedExternally
external fun <T1, TResult> promisify(fn: (arg1: T1, callback: (err: Error?, result: TResult) -> Unit) -> Unit): (arg1: T1) -> Promise<TResult> = definedExternally
external fun <T1> promisify(fn: (arg1: T1, callback: (err: Error?) -> Unit) -> Unit): (arg1: T1) -> Promise<Unit> = definedExternally
external fun <T1, T2, TResult> promisify(fn: (arg1: T1, arg2: T2, callback: (err: Error?, result: TResult) -> Unit) -> Unit): (arg1: T1, arg2: T2) -> Promise<TResult> = definedExternally
external fun <T1, T2> promisify(fn: (arg1: T1, arg2: T2, callback: (err: Error?) -> Unit) -> Unit): (arg1: T1, arg2: T2) -> Promise<Unit> = definedExternally
external fun <T1, T2, T3, TResult> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, callback: (err: Error?, result: TResult) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3) -> Promise<TResult> = definedExternally
external fun <T1, T2, T3> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, callback: (err: Error?) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3) -> Promise<Unit> = definedExternally
external fun <T1, T2, T3, T4, TResult> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: Error?, result: TResult) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<TResult> = definedExternally
external fun <T1, T2, T3, T4> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: Error?) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<Unit> = definedExternally
external fun <T1, T2, T3, T4, T5, TResult> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: Error?, result: TResult) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<TResult> = definedExternally
external fun <T1, T2, T3, T4, T5> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: Error?) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<Unit> = definedExternally
external fun promisify(fn: Function<*>): Function<*> = definedExternally
external interface `T$94` {
    var fatal: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreBOM: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface `T$95` {
    var stream: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class TextDecoder(encoding: String? = definedExternally /* null */, options: `T$94`? = definedExternally /* null */) {
    open var encoding: String = definedExternally
    open var fatal: Boolean = definedExternally
    open var ignoreBOM: Boolean = definedExternally
    open fun decode(input: dynamic /* Uint8Array | ArrayBuffer | DataView | Int8Array | Int16Array | Int32Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | Nothing? */ = definedExternally /* null */, options: `T$95`? = definedExternally /* null */): String = definedExternally
}
external open class TextEncoder {
    open var encoding: String = definedExternally
    open fun encode(input: String? = definedExternally /* null */): Uint8Array = definedExternally
}
