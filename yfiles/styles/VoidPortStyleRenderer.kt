// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.ILookup
import yfiles.graph.IPort
import yfiles.input.IHitTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * A void implementation of a port style renderer that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer">Online Documentation</a>
 */
external  class VoidPortStyleRenderer 
private constructor () : IPortStyleRenderer {

/**
 * Yields the [IBoundsProvider.EMPTY] that will return empty bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( port: IPort ,
 style: IPortStyle ):IBoundsProvider
/**
 * Yields a lookup that will only return [LassoTestables.NEVER][yfiles.input.LassoTestables.NEVER] if an [ILassoTestable][yfiles.input.ILassoTestable] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( port: IPort ,
 style: IPortStyle ):ILookup
/**
 * Yields the [IHitTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 final override   fun getHitTestable( port: IPort ,
 style: IPortStyle ):IHitTestable
/**
 * Yields the [IMarqueeTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 final override   fun getMarqueeTestable( port: IPort ,
 style: IPortStyle ):IMarqueeTestable
/**
 * Yields the [IVisibilityTestable.NEVER] that will always claim invisibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 final override   fun getVisibilityTestable( port: IPort ,
 style: IPortStyle ):IVisibilityTestable
/**
 * Yields the [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE] that will do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23VoidPortStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( port: IPort ,
 style: IPortStyle ):IVisualCreator

companion object : ClassMetadata<VoidPortStyleRenderer> {
/**
 * The [VoidPortStyleRenderer] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPortStyleRenderer%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IPortStyleRenderer
}
}
