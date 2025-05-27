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
import yfiles.lang.Func2
import yfiles.lang.Func3
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Simplifies using an [ILookupDecorator].
 * @param [TDecoratedType] The type of the instances whose [ILookup.lookup] behavior should be modified.
 * @param [TInterface] The interface or type that clients will use during the [ILookup.lookup] call. Note that this is normally an interface and not the implementation of the interface since client code will use the interface for the query.
 * @see [ILookup]
 * @see [GraphDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LookupDecorator] class.
 * @param [decoratedType] The type of the instances whose [ILookup.lookup] behavior should be modified.
 * @param [interfaceType] The interface or type that clients will use during the [ILookup.lookup] call. Note that this is normally an interface and not the implementation of the interface since client code will use the interface for the query.
 * @param [decorator] The decorator instance that will be used to [extend the Lookup mechanism][ILookupDecorator.addLookup].
 * @param [decorateNulls] The initial value of the [decorateNulls] property.
 * @param [nullIsFallback] The initial value of the [nullIsFallback] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-constructor-LookupDecorator">Online Documentation</a>
 * 
 * @property decorator
 * Gets the [ILookupDecorator] instance that is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23decorator">Online Documentation</a>
 * 
 * @property decorateNulls
 * Gets or sets a value indicating whether the [setImplementationWrapper] methods will wrap `null` values from the rest of the lookup chain or those values will simply be returned instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23decorateNulls">Online Documentation</a>
 * 
 * @property nullIsFallback
 * Gets or sets a value indicating whether a `null` result value of the [setFactory] methods should be interpreted as taking the fallback value, or actually return `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23nullIsFallback">Online Documentation</a>
 */
external  class LookupDecorator<TDecoratedType : IModelItem, TInterface : YObject>  (
 decoratedType: YClass<TDecoratedType> ,
 interfaceType: YClass<TInterface> ,
final val decorator: ILookupDecorator?,
final var decorateNulls: Boolean,
final var nullIsFallback: Boolean) : YObject {

/**
 * Tries to add the provided chain link to the [decorator].
 * @param [lookup] The link to add.
 * @return The `lookup` that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if the decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-addChainLink">Online Documentation</a>
 */
 final   fun addChainLink( lookup: IContextLookupChainLink<TDecoratedType>? ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of all `TDecoratedType` items matching a `predicate` to return `null` if `TInterface` is queried during the [ILookup.lookup].
 * @param [predicate] The predicate that determines for which items the implementation shall be hidden.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-hideImplementation">Online Documentation</a>
 */
 final   fun hideImplementation( predicate: Predicate<TDecoratedType>?  = definedExternally):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of all `TDecoratedType` items, so that `factory` is used to create a `TInterface` instance if `TInterface` is queried during the [ILookup.lookup].
 * @param [factory] The factory that is queried to create the result.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see [nullIsFallback]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setFactory(Factory)">Online Documentation</a>
 */
 final   fun setFactory( factory: Factory<TDecoratedType, TInterface> ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of items matching a `predicate` with a `factory` that creates a `TInterface` instance if `TInterface` is queried during the [ILookup.lookup].
 * @param [predicate] The predicate that determines for which items the factory shall be called.
 * @param [factory] The factory that is queried to create the result.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see [nullIsFallback]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setFactory(system.Predicate,system.Func2)">Online Documentation</a>
 */
 final   fun setFactory( predicate: Predicate<TDecoratedType> ,
 factory: Func2<TDecoratedType, TInterface> ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of all items of type `TDecoratedType` to return the given `TInterface` `implementation` if `TInterface` is queried on an item's [ILookup.lookup].
 * @param [implementation] The implementation to return unconditionally.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setImplementation(TInterface)">Online Documentation</a>
 */
 final   fun setImplementation( implementation: TInterface? ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of the given `item` to return the given `TInterface` `implementation` if `TInterface` is queried on the `item`'s [ILookup.lookup].
 * @param [item] The item for which the implementation shall be returned.
 * @param [implementation] The implementation to return if `item` is queried for `TInterface`.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setImplementation(TDecoratedType,TInterface)">Online Documentation</a>
 */
 final   fun setImplementation( item: TDecoratedType ,
 implementation: TInterface? ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of all items of type `TDecoratedType` which match a `predicate` to return the given `TInterface` `implementation` if `TInterface` is queried on an item's [ILookup.lookup].
 * @param [predicate] A predicate that determines which items are affected.
 * @param [implementation] The implementation to return if the `predicate` matches and `TInterface` is queried.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setImplementation(system.Predicate,TInterface)">Online Documentation</a>
 */
 final   fun setImplementation( predicate: Predicate<TDecoratedType> ,
 implementation: TInterface? ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of all items with a `factory` callback that wraps the underlying implementation if `TInterface` is queried during the [ILookup.lookup].
 * @param [factory] The factory that will be passed the underlying implementation and that is queried to create the result.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setImplementationWrapper(WrapperFactory)">Online Documentation</a>
 */
 final   fun setImplementationWrapper( factory: WrapperFactory<TDecoratedType, TInterface> ):IContextLookupChainLink<TDecoratedType>?
/**
 * Sets the [ILookup.lookup] of items matching a `predicate` with a `factory` callback that wraps the underlying implementation if `TInterface` is queried during the [ILookup.lookup].
 * @param [predicate] The predicate that determines for which items the wrapping shall be performed.
 * @param [factory] The factory that will be passed the underlying implementation and that is queried to create the result.
 * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator.addLookup] to the [decorator] as a result of this call, or `null` if decoration was unsuccessful.
 * @see [ILookupDecorator.addLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LookupDecorator%23LookupDecorator-method-setImplementationWrapper(system.Predicate,system.Func3)">Online Documentation</a>
 */
 final   fun setImplementationWrapper( predicate: Predicate<TDecoratedType> ,
 factory: Func3<TDecoratedType, TInterface, TInterface> ):IContextLookupChainLink<TDecoratedType>?

companion object : ClassMetadata<LookupDecorator<*, *>> {
}
}
