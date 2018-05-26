@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("dns") JsQualifier("resolve")]
package dns.resolve

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

external fun __promisify__(hostname: String, rrtype: String? /* "A" */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String? /* "AAAA" */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String? /* "CNAME" */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String? /* "NS" */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String? /* "PTR" */ = definedExternally /* null */): Promise<Array<String>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String /* "MX" */): Promise<Array<dns.MxRecord>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String /* "NAPTR" */): Promise<Array<dns.NaptrRecord>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String /* "SOA" */): Promise<dns.SoaRecord> = definedExternally
external fun __promisify__(hostname: String, rrtype: String /* "SRV" */): Promise<Array<dns.SrvRecord>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String /* "TXT" */): Promise<Array<Array<String>>> = definedExternally
external fun __promisify__(hostname: String, rrtype: String? = definedExternally /* null */): Promise<dynamic /* Array<String> | Array<dns.MxRecord> | Array<dns.NaptrRecord> | dns.SoaRecord | Array<dns.SrvRecord> | Array<Array<String>> */> = definedExternally
external fun __promisify__(hostname: String): Promise<Array<String>> = definedExternally
