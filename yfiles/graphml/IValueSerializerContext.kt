// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.graph.ILookup
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass

/**
 * Support interface used by [ValueSerializer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IValueSerializerContext">Online Documentation</a>
 */
external interface IValueSerializerContext : ILookup {
/**
 * Gets the value serializer for a specific type.
 * @param [type] The type to obtain a serializer for.
 * @return A serializer or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IValueSerializerContext%23IValueSerializerContext-method-getValueSerializerFor(yfiles.lang.Class)">Online Documentation</a>
 */
   fun getValueSerializerFor( type: YClass<*> ):ValueSerializer?
/**
 * Gets the value serializer for a specific [Property].
 * @param [property] The descriptor of the property.
 * @return A serializer or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IValueSerializerContext%23IValueSerializerContext-method-getValueSerializerFor(Property)">Online Documentation</a>
 */
   fun getValueSerializerFor( property: Property ):ValueSerializer?

companion object : InterfaceMetadata<IValueSerializerContext> {
}
}
