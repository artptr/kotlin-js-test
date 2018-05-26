@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package events

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

@JsModule("events")
external open class internal : NodeJS.EventEmitter {
    open class EventEmitter : internal {
        open fun addListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun addListener(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun on(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun on(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun once(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun once(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun prependListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun prependListener(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun prependOnceListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun prependOnceListener(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun removeListener(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun removeListener(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun off(event: String, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        open fun off(event: Any?, listener: (args: Any) -> Unit): EventEmitter /* this */ = definedExternally
        override fun removeAllListeners(event: String?): EventEmitter /* this */ = definedExternally
        override fun removeAllListeners(event: Any?): EventEmitter /* this */ = definedExternally
        override fun setMaxListeners(n: Number): EventEmitter /* this */ = definedExternally
        override fun getMaxListeners(): Number = definedExternally
        override fun listeners(event: String): Array<Function<*>> = definedExternally
        override fun listeners(event: Any?): Array<Function<*>> = definedExternally
        override fun rawListeners(event: String): Array<Function<*>> = definedExternally
        override fun rawListeners(event: Any?): Array<Function<*>> = definedExternally
        override fun emit(event: String, vararg args: Any): Boolean = definedExternally
        override fun emit(event: Any?, vararg args: Any): Boolean = definedExternally
        override fun eventNames(): Array<dynamic /* String | Any? */> = definedExternally
        override fun listenerCount(type: String): Number = definedExternally
        override fun listenerCount(type: Any?): Number = definedExternally
        companion object {
            fun listenerCount(emitter: EventEmitter, event: String): Number = definedExternally
            fun listenerCount(emitter: EventEmitter, event: Any?): Number = definedExternally
            var defaultMaxListeners: Number = definedExternally
        }
        override fun removeAllListeners(): EventEmitter /* this */ = definedExternally
    }
}
