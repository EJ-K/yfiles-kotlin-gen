// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An implementation of a chain of [IContextLookupChainLink]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-constructor-LookupChain">Online Documentation</a>
 */
external open class LookupChain<TItem : YObject>  () : IContextLookup<TItem>, IPropertyObservable {

/**
 * Adds the given link to the end of the chain.
 * @param [lookup] The link to add.
 * @see [remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-add(IContextLookupChainLink)">Online Documentation</a>
 */
 final   fun add( lookup: IContextLookupChainLink<TItem> )

/**
 * Adds the given link to the end of the chain.
 * @param [lookup] The link to add.
 * @see [remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-add(IContextLookupChainLink)">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( lookup: IContextLookupChainLink<TItem> )
/**
 * A convenience method that adds a [IContextLookupChainLink] to the given chain that is based on a function of type `function(``TContext``)`.
 * @param [TContext] The type of the context.
 * @param [TResult] The type of the result.
 * @param [contextType] The type of the context.
 * @param [resultType] The type of the result.
 * @param [factory] The factory that will be called for queries to `TResult`.
 * @param [nullIsFallback] If set to `true`, `null` return values of the factory method will be interpreted as the final result, otherwise the request will propagate down the chain.
 * @return The link that has been registered with the chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-add(yfiles.lang.Class,yfiles.lang.Class,Factory,boolean)">Online Documentation</a>
 */
 final   fun <TContext : YObject, TResult : YObject>add( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 factory: Factory<TContext, TResult> ,
 nullIsFallback: Boolean  = definedExternally):IContextLookupChainLink<TItem>
/**
 * A convenience method that adds a [IContextLookupChainLink] to the given chain that is based on a function of type `function(TContext, TResult)`.
 * @param [TContext] The type of the context.
 * @param [TResult] The type of the result.
 * @param [contextType] The type of the context.
 * @param [resultType] The type of the result.
 * @param [wrapperFactory] The wrapper factory that will be called for queries to `TResult` to wrap the result of the query to the remainder of the chain.
 * @param [decorateNull] if set to `true` `null` return values of the remainder of the chain will be passed to the wrapper factory so that it can decorate the null, otherwise null will be yielded as the final result.
 * @return The link that has been registered with the chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-add(yfiles.lang.Class,yfiles.lang.Class,WrapperFactory,boolean)">Online Documentation</a>
 */
 final   fun <TContext : YObject, TResult : YObject>add( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 wrapperFactory: WrapperFactory<TContext, TResult> ,
 decorateNull: Boolean  = definedExternally):IContextLookupChainLink<TItem>
/**
 * [Adds][add] a lookup implementation that always yields a constant `result` to the chain.
 * @param [TResult] The type of the query, which is a base type or the type of the result.
 * @param [result] The constant value to yield if the chain is queried for an implementation of type `TResult`.
 * @return The [IContextLookupChainLink] instance that has been added to the chain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-defaultmethod-addConstant">Online Documentation</a>
 */
   fun <TResult : YObject>addConstant( resultType: YClass<TResult> ,
 result: TResult? ):IContextLookupChainLink<TItem>
/**
 * Performs the actual lookup operation.
 * @param [item] The item to use as the context.
 * @param [type] The type of the query.
 * @return The result of the query.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-contextLookup">Online Documentation</a>
 */
 final override   fun <T : YObject>contextLookup( item: TItem ,
 type: YClass<T> ):T?
/**
 * Can be called by client code to trigger the [PropertyChanged] event manually.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-notifyChange">Online Documentation</a>
 */
 open   fun notifyChange()
/**
 * Notifies client code that the lookup of this instance might have changed.
 * @param [event] The arguments
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Removes the link that has previously been added to this instance from this chain.
 * @param [link] The link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-remove">Online Documentation</a>
 */
 final   fun remove( link: IContextLookupChainLink<TItem> )

/**
 * Removes the link that has previously been added to this instance from this chain.
 * @param [link] The link to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23LookupChain-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( link: IContextLookupChainLink<TItem> )
/**
 * Occurs when the lookup of this instance has changed for some or all of the types or items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupChain%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<LookupChain<*>> {
}
}
