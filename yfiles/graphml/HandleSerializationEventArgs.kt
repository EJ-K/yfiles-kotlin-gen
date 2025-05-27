// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.YClass

/**
 * The event arguments used by [GraphMLIOHandler.HandleSerialization] and [GraphMLWriter.HandleSerialization] to let registered serialization code perform the serialization of items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [HandleSerializationEventArgs] class using the provided context to write the `item` using the given type for serialization.
 * @param [context] The context to use for writing.
 * @param [item] The item to to serialize.
 * @param [sourceType] The type that should be used for serialization, which needs to be a super type or interface of the `item` or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23HandleSerializationEventArgs-constructor-HandleSerializationEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context to be used for writing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23context">Online Documentation</a>
 * 
 * @property item
 * Gets the item that should be serialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23item">Online Documentation</a>
 * 
 * @property sourceType
 * Gets the type in the inheritance of the [item] that should be used for serialization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23sourceType">Online Documentation</a>
 */
external  class HandleSerializationEventArgs  (
final val context: IWriteContext,
final val item: Any?,
final val sourceType: YClass<*>? = definedExternally) : EventArgs {

/**
 * Gets or sets a value indicating whether this [HandleSerializationEventArgs] is handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets the writer for writing the xml output.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23writer">Online Documentation</a>
 */
final val writer: IXmlWriter
/**
 * Replaces the [item] using a substitute for serialization.
 * @param [item] The substitute to assign to the [item] property.
 * @param [serializationType] The serialization type to assign to the [sourceType] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleSerializationEventArgs%23HandleSerializationEventArgs-method-replaceItem">Online Documentation</a>
 */
 final   fun replaceItem( item: Any? ,
 serializationType: YClass<*>? )

companion object : ClassMetadata<HandleSerializationEventArgs> {
}
}
