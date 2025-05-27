// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.graph

import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.IEventDispatcher
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Event delegate method that is used in [IGraph]'s [BendLocationChanged][IGraph.BendLocationChanged] event.
 * @param [source] The source of the event.
 * @param [bend] The bend whose location has changed.
 * @param [oldLocation] The bend location before the change.
 */
typealias BendLocationChangedHandler = (source: IEventDispatcher,
bend: IBend,
oldLocation: Point) -> Unit

/**
 * The delegate that is used by [DelegateUndoUnit].
 * @param [param] An usage dependent parameter that is passed to the delegate.
 */
typealias DoHandlerDelegate<T> = (param: T) -> Unit

/**
 * Callback delegate used by [GraphCopier] and the like.
 * @param [original] The element that has been copied.
 * @param [copy] The copy of the original element.
 */
typealias ElementCopiedCallback = (original: IModelItem,
copy: IModelItem) -> Unit

/**
 * A function which provides a custom into a custom implementation of `TInterface` for the given `item`.
 * @param [TDecoratedType] The type to decorate.
 * @param [TInterface] The interface to provide an implementation for.
 * @param [item] The item to return the implementation for.
 * @return The new implementation.
 */
typealias Factory<TDecoratedType, TInterface> = (item: TDecoratedType) -> TInterface

/**
 * Callback delegate that can be used to query results of a virtual [ILookup.lookup] call on objects that don't necessarily implement `ILookup`.
 * @param [subject] the subject for which a lookup shall be made
 * @param [type] the type to look up
 * @return an instance that can be assigned to type or `null`
 */
typealias LookupCallback<T> = (subject: T,
type: YClass<*>) -> YObject?

/**
 * A delegate that mimics the [IMapper.get][yfiles.collections.IMapper.get] access.
 * @param [K] The type of element this delegate accepts as keys for the mapping.
 * @param [V] The type of element this delegate returns as values for the mapping.
 * @param [key] The key of the mapping.
 * @return The value or a suitable default that is associated with `key`.
 */
typealias MapperDelegate<K, V> = (key: K) -> V?

/**
 * A function that is used to retrieve an [IMementoSupport] for any given object.
 * @param [item] The item to provide the [IMementoSupport] for.
 */
typealias MementoSupportProvider<T> = (item: T) -> IMementoSupport<T, *>

/**
 * Event delegate method that is used in [IGraph]'s [NodeLayoutChanged][IGraph.NodeLayoutChanged] event.
 * @param [source] The source of the event.
 * @param [node] The node whose layout has changed.
 * @param [oldLayout] The node layout before the change.
 */
typealias NodeLayoutChangedHandler = (source: IEventDispatcher,
node: INode,
oldLayout: Rect) -> Unit

/**
 * A function which wraps the `originalImplementation` of `TInterface` into a custom implementation for the given `item`.
 * @param [TDecoratedType] The type to decorate.
 * @param [TInterface] The interface to provide an implementation for.
 * @param [item] The item to return the wrapped implementation for.
 * @param [originalImplementation] The original implementation to wrap.
 * @return The new implementation.
 */
typealias WrapperFactory<TDecoratedType, TInterface> = (item: TDecoratedType,
originalImplementation: TInterface) -> TInterface
