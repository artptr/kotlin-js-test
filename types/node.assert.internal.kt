@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("assert")
package assert.internal

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

external interface `T$96` {
    var message: String? get() = definedExternally; set(value) = definedExternally
    var actual: Any? get() = definedExternally; set(value) = definedExternally
    var expected: Any? get() = definedExternally; set(value) = definedExternally
    var operator: String? get() = definedExternally; set(value) = definedExternally
    var stackStartFunction: Function<*>? get() = definedExternally; set(value) = definedExternally
}
external open class AssertionError(options: `T$96`? = definedExternally /* null */) : Error {
    override var name: String = definedExternally
    override var message: String = definedExternally
    open var actual: Any = definedExternally
    open var expected: Any = definedExternally
    open var operator: String = definedExternally
    open var generatedMessage: Boolean = definedExternally
}
external fun fail(message: String): Any? = definedExternally
external fun fail(actual: Any, expected: Any, message: String? = definedExternally /* null */, operator: String? = definedExternally /* null */): Any? = definedExternally
external fun ok(value: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun equal(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun notEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun deepEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun notDeepEqual(acutal: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun strictEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun notStrictEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun deepStrictEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun notDeepStrictEqual(actual: Any, expected: Any, message: String? = definedExternally /* null */): Unit = definedExternally
external fun throws(block: Function<*>, message: String? = definedExternally /* null */): Unit = definedExternally
external fun throws(block: Function<*>, error: Function<*>, message: String? = definedExternally /* null */): Unit = definedExternally
external fun throws(block: Function<*>, error: RegExp, message: String? = definedExternally /* null */): Unit = definedExternally
external fun throws(block: Function<*>, error: (err: Any) -> Boolean, message: String? = definedExternally /* null */): Unit = definedExternally
external fun doesNotThrow(block: Function<*>, message: String? = definedExternally /* null */): Unit = definedExternally
external fun doesNotThrow(block: Function<*>, error: Function<*>, message: String? = definedExternally /* null */): Unit = definedExternally
external fun doesNotThrow(block: Function<*>, error: RegExp, message: String? = definedExternally /* null */): Unit = definedExternally
external fun doesNotThrow(block: Function<*>, error: (err: Any) -> Boolean, message: String? = definedExternally /* null */): Unit = definedExternally
external fun ifError(value: Any): Unit = definedExternally
external fun rejects(block: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Promise<Any>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Function<*>, error: Any, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Function<*>, error: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Function<*>, error: RegExp, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Function<*>, error: Error, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Promise<Any>, error: Any, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Promise<Any>, error: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Promise<Any>, error: RegExp, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun rejects(block: Promise<Any>, error: Error, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Promise<Any>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Function<*>, error: Any, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Function<*>, error: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Function<*>, error: RegExp, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Function<*>, error: Error, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Promise<Any>, error: Any, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Promise<Any>, error: Function<*>, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Promise<Any>, error: RegExp, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
external fun doesNotReject(block: Promise<Any>, error: Error, message: String? = definedExternally /* null */): Promise<Unit> = definedExternally
