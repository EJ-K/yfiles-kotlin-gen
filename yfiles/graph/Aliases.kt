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

/**
 * Event delegate method that is used in [IGraph]'s [bend-location-changed][IGraph] event.
 * @param [bend] The bend whose location has changed.
 * @param [oldLocation] The bend location before the change.
 * @param [source] The source of the event.
 */
typealias BendLocationChangedHandler = (bend: IBend, oldLocation: Point, source: IEventDispatcher) -> Unit

/**
 * The delegate that is used by [fromHandler][IUndoUnit].
 * @param [param] A usage-dependent parameter that is passed to the delegate.
 */
typealias DoHandlerDelegate<T> = (param: T) -> Unit

/**
 * Callback delegate used by [GraphCopier], [ClipboardGraphCopier], and the like.
 * @param [original] The element that has been copied.
 * @param [copy] The copy of the original element.
 */
typealias ItemCopiedCallback = (original: IModelItem, copy: IModelItem) -> Unit

/**
 * A function that is used to retrieve an [IMementoSupport] for any given object.
 * @param [item] The item to provide the [IMementoSupport] for.
 */
typealias MementoSupportProvider<T> = (item: T) -> IMementoSupport<T, *>

/**
 * Event delegate method that is used in [IGraph]'s [node-layout-changed][IGraph] event.
 * @param [node] The node whose layout has changed.
 * @param [oldLayout] The node layout before the change.
 * @param [source] The source of the event.
 */
typealias NodeLayoutChangedHandler = (node: INode, oldLayout: Rect, source: IEventDispatcher) -> Unit
