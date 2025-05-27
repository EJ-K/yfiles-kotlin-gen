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
 * Interface that can be used to decorate the lookup result for a set of types.
 * @see [ILookup]
 * @see [IContextLookupChainLink]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator">Online Documentation</a>
 */
external interface ILookupDecorator : YObject {
/**
 * Adds a lookup implementation for a given type using a func.
 * @param [TContext] The type of the context subject.
 * @param [TResult] The type of the query, which is a base type or the type of the result.
 * @param [factory] The factory delegate that will be used to satisfy queries of type `TResult`.
 * @param [nullIsFallback] Whether to treat `null`-results of the `factory` as hints to use the remainder of the chain link or to actually yield the value as the final result.
 * @return The [IContextLookupChainLink] instance as returned by the [addLookup] call or `null`, if either `decorator` was `null`, or it [could not decorate][canDecorate] the `TContext` type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-defaultmethod-add(yfiles.lang.Class,yfiles.lang.Class,Factory,boolean)">Online Documentation</a>
 */
  final  fun <TContext : YObject, TResult : YObject>add( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 factory: Factory<TContext, TResult> ,
 nullIsFallback: Boolean?  = definedExternally):IContextLookupChainLink<*>? = definedExternally
/**
 * Adds a lookup implementation for a given type using a function of type `function(TContext, TResult)`.
 * @param [TContext] The type of the context subject.
 * @param [TResult] The type of the query, which is a base type or the type of the result.
 * @param [wrapperFactory] The factory delegate that will be used to satisfy queries of type `TResult`
 * @param [decorateNull] Whether to actually decorate `null` results of remainder of the chain. If this is set to `false`, the `wrapperFactory` will never be called with `null` as the second argument but the result of the query for this chain link will be the `null` value.
 * @return The [IContextLookupChainLink] instance as returned by the [addLookup] call or `null`, if either `decorator` was `null`, or it [could not decorate][canDecorate] the `TContext` type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-defaultmethod-add(yfiles.lang.Class,yfiles.lang.Class,WrapperFactory,boolean)">Online Documentation</a>
 */
  final  fun <TContext : YObject, TResult : YObject>add( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 wrapperFactory: WrapperFactory<TContext, TResult> ,
 decorateNull: Boolean?  = definedExternally):IContextLookupChainLink<*>? = definedExternally
/**
 * Add a lookup implementation for a given type that always yields a constant result.
 * @param [TContext] The type of the context subject.
 * @param [TResult] The type of the query, which is a base type or the type of the result.
 * @param [result] The constant value to yield if the chain is queried for an implementation of type `TResult`.
 * @return The [IContextLookupChainLink] instance as returned by the [addLookup] call or `null`, if either `decorator` was `null`, or it [could not decorate][canDecorate] the `TContext` type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-defaultmethod-addConstant">Online Documentation</a>
 */
  final  fun <TContext : YObject, TResult : YObject>addConstant( contextType: YClass<TContext> ,
 resultType: YClass<TResult> ,
 result: TResult? ):IContextLookupChainLink<*>? = definedExternally
/**
 * Adds a lookup chain element to the chain of lookups for a given type.
 * @param [t] The type to decorate the lookup.
 * @param [lookup] The chain element to add to the lookup of the given type.
 * @see [removeLookup]
 * @see [add]
 * @see [addConstant]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-method-addLookup">Online Documentation</a>
 */
   fun <T : YObject>addLookup( t: YClass<T> ,
 lookup: IContextLookupChainLink<T> )
/**
 * Determines whether this instance can be used to decorate the lookup for a certain type.
 * @param [t] The type to decorate the lookup for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-method-canDecorate">Online Documentation</a>
 */
 infix   fun canDecorate( t: YClass<*> ):Boolean
/**
 * Removes a previously registered lookup chain element from the chain of lookups for a given type.
 * @param [t] The type to remove the decorator from.
 * @param [lookup] The chain element to remove from the lookup of the given type.
 * @see [addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookupDecorator%23ILookupDecorator-method-removeLookup">Online Documentation</a>
 */
   fun <T : YObject>removeLookup( t: YClass<T> ,
 lookup: IContextLookupChainLink<T> )

companion object : InterfaceMetadata<ILookupDecorator> {
}
}
