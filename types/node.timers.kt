@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("timers")
package timers

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

external fun setTimeout(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): NodeJS.Timer = definedExternally
external fun clearTimeout(timeoutId: NodeJS.Timer): Unit = definedExternally
external fun setInterval(callback: (args: Any) -> Unit, ms: Number, vararg args: Any): NodeJS.Timer = definedExternally
external fun clearInterval(intervalId: NodeJS.Timer): Unit = definedExternally
external fun setImmediate(callback: (args: Any) -> Unit, vararg args: Any): Any = definedExternally
external fun clearImmediate(immediateId: Any): Unit = definedExternally
