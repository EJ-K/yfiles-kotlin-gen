// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Document
import yfiles.lang.ClassMetadata

/**
 * Default implementation of [IXmlWriter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter">Online Documentation</a>
 * 
 * @constructor Create a new instance with enabled [indent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-constructor-XmlWriter">Online Documentation</a>
 */
external open class XmlWriter  () : IXmlWriter {

/**
 * This property controls whether the output should be properly indented.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23indent">Online Documentation</a>
 */
final var indent: Boolean
/**
 * Gets the namespace manager associated with this writer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23namespaceManager">Online Documentation</a>
 */
final override val namespaceManager: IXmlNamespaceManager
/**
 * Closes the current element.
 * @param [addEndTag] Specifies whether to add an end tag or to write a self-closing element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-closeCurrentElement">Online Documentation</a>
 */
 open protected   fun closeCurrentElement( addEndTag: Boolean )
/**
 * Factory method that creates the namespace manager for this instance.
 * @return A new manager instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-createNamespaceManager">Online Documentation</a>
 */
 open protected   fun createNamespaceManager():IXmlNamespaceManager
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-flushDocument">Online Documentation</a>
 */
 override   fun flushDocument()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-getXmlString">Online Documentation</a>
 */
 override   fun getXmlString():String
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeAttributeNS">Online Documentation</a>
 */
 override   fun writeAttributeNS( prefix: String? ,
 localName: String ,
 ns: String? ,
 value: String ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeCData">Online Documentation</a>
 */
 override   fun writeCData( content: String ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeComment">Online Documentation</a>
 */
 override   fun writeComment( comment: String ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeDocumentFragment">Online Documentation</a>
 */
 override   fun writeDocumentFragment( fragment: Document ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeEndDocument">Online Documentation</a>
 */
 override   fun writeEndDocument()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeEndElement">Online Documentation</a>
 */
 override   fun writeEndElement():IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeProcessingInstruction">Online Documentation</a>
 */
 override   fun writeProcessingInstruction( target: String ,
 data: String ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeStartDocument">Online Documentation</a>
 */
 override   fun writeStartDocument():IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeStartElement">Online Documentation</a>
 */
 override   fun writeStartElement( localName: String ,
 ns: String? ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeStartElement">Online Documentation</a>
 */
 override   fun writeStartElement( prefix: String? ,
 localName: String ,
 ns: String? ):IXmlWriter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XmlWriter%23XmlWriter-method-writeString">Online Documentation</a>
 */
 override   fun writeString( s: String ):IXmlWriter

companion object : ClassMetadata<XmlWriter> {
}
}

inline fun XmlWriter(
    block: XmlWriter.() -> Unit
): XmlWriter {
    return XmlWriter()
        .apply(block)
}
