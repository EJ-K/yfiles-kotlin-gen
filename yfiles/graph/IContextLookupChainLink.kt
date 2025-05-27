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
 * An interface for instances that can be used to chain lookup operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink">Online Documentation</a>
 */
external interface IContextLookupChainLink<TItem : YObject> : IContextLookup<TItem> {
/**
 * This method is called by the framework to register the fallback lookup implementation that should be used during a call to [IContextLookup.contextLookup].
 * @param [next] The context to use as a fallback.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-method-setNext">Online Documentation</a>
 */
   fun setNext( next: IContextLookup<TItem> )

companion object : InterfaceMetadata<IContextLookupChainLink<*>> {
/**
 * Factory method for a [lookup chain element][IContextLookupChainLink] that adds an dynamic instance to a lookup chain.
 * @param [instance] The instance to query the type from dynamically.
 * @return An instance that can be used in a lookup chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-addingLookupChainLink(Object)">Online Documentation</a>
 */
   fun addingLookupChainLink( instance: Any ):IContextLookupChainLink<*>
/**
 * Factory method for a [lookup chain element][IContextLookupChainLink] that adds an [ILookup] layer to a lookup chain.
 * @param [lookup] The lookup to use.
 * @return An instance that can be used in a lookup chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-addingLookupChainLink(ILookup)">Online Documentation</a>
 */
   fun addingLookupChainLink( lookup: ILookup ):IContextLookupChainLink<*>
/**
 * Factory method for a [lookup chain element][IContextLookupChainLink] that simply adds an entry to a lookup chain.
 * @param [type] The type to add to the lookup.
 * @param [instance] The instance to return if the `type` is being looked up.
 * @return An instance that can be used in a lookup chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-addingLookupChainLink(yfiles.lang.Class,Object)">Online Documentation</a>
 */
   fun <TResult : YObject>addingLookupChainLink( type: YClass<TResult> ,
 instance: TResult? ):IContextLookupChainLink<*>
/**
 * Creates a lookup chain link that is backed by the given `callback`.
 * @param [callback] The callback to invoke.
 * @return The implementation of the link that uses the `callback`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-createContextLookupChainLink">Online Documentation</a>
 */
   fun <T : YObject>createContextLookupChainLink( callback: LookupCallback<T> ):IContextLookupChainLink<T>
/**
 * Factory method for a [lookup chain element][IContextLookupChainLink] that uses a function of type `function(``TContext``)` to yield a `TResult` for a specific `TContext`.
 * @param [factory] The factory delegate to use that yields the result for a given context.
 * @return An instance that can be used in a lookup chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-factoryLookupChainLink">Online Documentation</a>
 */
   fun <TContext : YObject, TResult : YObject>factoryLookupChainLink( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 factory: Factory<TContext, TResult> ):IContextLookupChainLink<*>
/**
 * Factory method for a [lookup chain element][IContextLookupChainLink] that removes the entry from the lookup chain for a given type.
 * @param [type] The type to hide from the lookup.
 * @return An instance that can be used in a lookup chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContextLookupChainLink%23IContextLookupChainLink-defaultmethod-hidingLookupChainLink">Online Documentation</a>
 */
   fun hidingLookupChainLink( type: YClass<*> ):IContextLookupChainLink<*>
}
}
