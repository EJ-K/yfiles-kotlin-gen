// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import web.dom.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.IClassMetadata

/**
 * The event arguments used by [handle-deserialization][GraphMLIOHandler] to let registered deserialization code perform the deserialization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [HandleDeserializationEventArgs] class.
 * @param [context] The context in which serialization should take place.
 * @param [xmlNode] The XML element that contains the data to deserialize.
 * @param [targetType] The required [targetType][HandleDeserializationEventArgs] of the [result][HandleDeserializationEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23HandleDeserializationEventArgs-constructor-HandleDeserializationEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context in which the [xmlNode][HandleDeserializationEventArgs] shall be deserialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23context">Online Documentation</a>
 * 
 * @property xmlNode
 * Gets the XML node that contains the data to deserialize.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23xmlNode">Online Documentation</a>
 * 
 * @property targetType
 * Gets the type of the resulting instance that is required by the requesting deserializer or `null` if the target type is not known in advance.
 * @see [IParseContext.deserializeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23targetType">Online Documentation</a>
 */
external class HandleDeserializationEventArgs (
final val context: IParseContext,
final val xmlNode: Node,
final val targetType: IClassMetadata<*>?) : EventArgs {
  /**
   * Gets or sets a value indicating whether this [HandleDeserializationEventArgs] is handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23handled">Online Documentation</a>
   */
  final var handled: Boolean
  
  /**
   * Gets or sets the result of the deserialization, which is `null` initially.
   * @throws ArgumentError If the value is not assignable to [targetType][HandleDeserializationEventArgs]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleDeserializationEventArgs%23result">Online Documentation</a>
   */
  final var result: Any?
  
  companion object : ClassMetadata<HandleDeserializationEventArgs> {
  }
}
