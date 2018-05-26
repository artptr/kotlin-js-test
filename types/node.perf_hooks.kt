@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("perf_hooks")
package perf_hooks

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

external interface PerformanceEntry {
    var duration: Number
    var name: String
    var startTime: Number
    var entryType: String
    var kind: Number? get() = definedExternally; set(value) = definedExternally
}
external interface PerformanceNodeTiming : PerformanceEntry {
    var bootstrapComplete: Number
    var clusterSetupEnd: Number
    var clusterSetupStart: Number
    var loopExit: Number
    var loopStart: Number
    var moduleLoadEnd: Number
    var moduleLoadStart: Number
    var nodeStart: Number
    var preloadModuleLoadEnd: Number
    var preloadModuleLoadStart: Number
    var thirdPartyMainEnd: Number
    var thirdPartyMainStart: Number
    var v8Start: Number
}
external interface Performance {
    fun clearFunctions(name: String? = definedExternally /* null */)
    fun clearMarks(name: String? = definedExternally /* null */)
    fun clearMeasures(name: String? = definedExternally /* null */)
    fun getEntries(): Array<PerformanceEntry>
    fun getEntriesByName(name: String, type: String? = definedExternally /* null */): Array<PerformanceEntry>
    fun getEntriesByType(type: String): Array<PerformanceEntry>
    fun mark(name: String? = definedExternally /* null */)
    fun measure(name: String, startMark: String, endMark: String)
    var nodeTiming: PerformanceNodeTiming
    fun now(): Number
    var timeOrigin: Number
    fun <T : (optionalParams: Any) -> Any> timerify(fn: T): T
}
external interface PerformanceObserverEntryList {
    fun getEntries(): Array<PerformanceEntry>
    fun getEntriesByName(name: String, type: String? = definedExternally /* null */): Array<PerformanceEntry>
    fun getEntriesByType(type: String): Array<PerformanceEntry>
}
external interface `T$97` {
    var entryTypes: Array<String>
    var buffered: Boolean? get() = definedExternally; set(value) = definedExternally
}
external open class PerformanceObserver(callback: (list: PerformanceObserverEntryList, observer: PerformanceObserver) -> Unit) : async_hooks.AsyncResource {
    open fun disconnect(): Unit = definedExternally
    open fun observe(options: `T$97`): Unit = definedExternally
}
external var performance: Performance = definedExternally
