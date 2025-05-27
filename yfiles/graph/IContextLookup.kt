// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An interface for instances that can provide a [ILookup] capabilities for a given object.
 * @see [ILookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookup">Online Documentation</a>
 */
external interface IContextLookup<in TItem : YObject> : YObject {
/**
 * Tries to create or retrieve an implementation of the given type for a given item.
 * @param [item] the item to lookup a type for
 * @param [type] the type to look up
 * @return an implementation or `null`
 * @see [ILookup.lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookup%23IContextLookup-method-contextLookup">Online Documentation</a>
 */
   fun <T : YObject>contextLookup( item: TItem ,
 type: YClass<T> ):T?

companion object : InterfaceMetadata<IContextLookup<*>> {
/**
 * An `ILookupContext` instance that always returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookup%23EMPTY_CONTEXT_LOOKUP">Online Documentation</a>
 */
 val EMPTY_CONTEXT_LOOKUP: IContextLookup<*>
}
}
