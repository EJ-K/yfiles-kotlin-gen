// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * The interface used by the [GraphMLIOHandler] for writing data to the GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler">Online Documentation</a>
 */
external interface IOutputHandler : YObject {
/**
 * Gets the XML attributes that should be added to the data element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23dataTagAttributes">Online Documentation</a>
 */
val dataTagAttributes: IEnumerable<GraphMLXmlAttribute>
/**
 * Gets the XML attributes that should be added to the key definition in the GraphML key element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23keyDefinitionAttributes">Online Documentation</a>
 */
val keyDefinitionAttributes: IEnumerable<GraphMLXmlAttribute>
/**
 * Gets the write precedence that is associated with this instance.
 * @see [WritePrecedence]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23precedence">Online Documentation</a>
 */
val precedence: WritePrecedence
/**
 * Determines whether in the current context, the value is the default value and therefore no data element needs to be written.
 * @param [context] The context.
 * @return `true` if for the current context the default value applies and therefore no data element needs to be written.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23IOutputHandler-method-isDefaultValue">Online Documentation</a>
 */
   fun isDefaultValue( context: IWriteContext ):Boolean
/**
 * Writes the contents of the key definition.
 * @param [context] The context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23IOutputHandler-method-writeKeyDefinitionContent">Online Documentation</a>
 */
   fun writeKeyDefinitionContent( context: IWriteContext )
/**
 * Actually writes the value for the current context.
 * @param [context] The context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOutputHandler%23IOutputHandler-method-writeValue">Online Documentation</a>
 */
   fun writeValue( context: IWriteContext )

companion object : InterfaceMetadata<IOutputHandler> {
}
}
