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
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * A void implementation of a node style renderer that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer">Online Documentation</a>
 */
external  class VoidNodeStyleRenderer 
private constructor () : INodeStyleRenderer {

/**
 * Yields the [IBoundsProvider.EMPTY] that will return empty bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Yields a lookup that will only return [LassoTestables.NEVER][yfiles.input.LassoTestables.NEVER] if an [ILassoTestable][yfiles.input.ILassoTestable] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Yields the [IHitTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 final override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * Yields the [IMarqueeTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 final override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * This implementation always returns the [VoidShapeGeometry instance][VoidShapeGeometry.INSTANCE].
 * @param [node] The node to provide an instance for
 * @param [style] The style to use for the rendering
 * @return The [VoidShapeGeometry instance][VoidShapeGeometry.INSTANCE].
 * @see [INodeStyleRenderer.getShapeGeometry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 final override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Yields the [IVisibilityTestable.NEVER] that will always claim invisibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 final override   fun getVisibilityTestable( node: INode ,
 style: INodeStyle ):IVisibilityTestable
/**
 * Yields the [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE] that will do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23VoidNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator

companion object : ClassMetadata<VoidNodeStyleRenderer> {
/**
 * The [VoidNodeStyleRenderer] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidNodeStyleRenderer%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: INodeStyleRenderer
}
}
