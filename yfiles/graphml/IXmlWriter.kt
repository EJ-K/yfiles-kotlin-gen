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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Abstraction of XML output classes that provide a consistent way to write XML elements to some output
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter">Online Documentation</a>
 */
external interface IXmlWriter : YObject {
/**
 * Gets the namespace manager associated with this writer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23namespaceManager">Online Documentation</a>
 */
val namespaceManager: IXmlNamespaceManager
/**
 * Closes the document.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-flushDocument">Online Documentation</a>
 */
   fun flushDocument()
/**
 * Gets a text representation of all content that has been written so far.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-getXmlString">Online Documentation</a>
 */
   fun getXmlString():String
/**
 * Write an XML attribute with the given parameters.
 * @param [localName] The name of the attribute.
 * @param [value] The value of the attribute.
 * @return The writer instance `writer` for writer chaining.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-defaultmethod-writeAttribute">Online Documentation</a>
 */
  final  fun writeAttribute( localName: String ,
 value: String ):IXmlWriter = definedExternally
/**
 * Writes a XML attribute node.
 * @param [prefix] The namespace prefix of the attribute
 * @param [localName] The local name of the attribute
 * @param [ns] The namespace URI of this attribute
 * @param [value] The value of this attribute
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeAttributeNS">Online Documentation</a>
 */
   fun writeAttributeNS( prefix: String? ,
 localName: String ,
 ns: String? ,
 value: String ):IXmlWriter
/**
 * Writes a CDATA section.
 * @param [content] The content of the CDATA section
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeCData">Online Documentation</a>
 */
   fun writeCData( content: String ):IXmlWriter
/**
 * Writes a XML comment node
 * @param [comment] The content of the comment
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeComment">Online Documentation</a>
 */
   fun writeComment( comment: String ):IXmlWriter
/**
 * Writes a document fragment
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeDocumentFragment">Online Documentation</a>
 */
   fun writeDocumentFragment( fragment: Document ):IXmlWriter
/**
 * Closes the output.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeEndDocument">Online Documentation</a>
 */
   fun writeEndDocument()
/**
 * Closes a XML element previously opened with [writeStartElement] or [writeStartElement].
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeEndElement">Online Documentation</a>
 */
   fun writeEndElement():IXmlWriter
/**
 * Write an XML attribute from the given `attribute` struct.
 * @param [attribute] Encapsulates the current attribute values.
 * @return The writer instance `writer` for writer chaining.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-defaultmethod-writeGraphMLXmlAttribute">Online Documentation</a>
 */
  final  fun writeGraphMLXmlAttribute( attribute: GraphMLXmlAttribute ):IXmlWriter = definedExternally
/**
 * Writes a xml processing instruction.
 * @param [target] The target of the PI
 * @param [data] The data of the PI
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeProcessingInstruction">Online Documentation</a>
 */
   fun writeProcessingInstruction( target: String ,
 data: String ):IXmlWriter
/**
 * Begins the output process
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeStartDocument">Online Documentation</a>
 */
   fun writeStartDocument():IXmlWriter
/**
 * Begin a new XML element with given parameters
 * @param [localName] The local name of this element
 * @param [ns] The namespace of this element
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeStartElement(string,string)">Online Documentation</a>
 */
   fun writeStartElement( localName: String ,
 ns: String? ):IXmlWriter
/**
 * Begins a new XML element with given parameters
 * @param [prefix] The namespace prefix to use for this element
 * @param [localName] The local name of this element
 * @param [ns] The namespace of this element
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeStartElement(string,string,string)">Online Documentation</a>
 */
   fun writeStartElement( prefix: String? ,
 localName: String ,
 ns: String? ):IXmlWriter
/**
 * Writes a text node.
 * @param [s] The string that gets written as XML text
 * @return The writer instance for further chaining
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlWriter%23IXmlWriter-method-writeString">Online Documentation</a>
 */
   fun writeString( s: String ):IXmlWriter

companion object : InterfaceMetadata<IXmlWriter> {
}
}
