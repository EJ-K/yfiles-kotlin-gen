// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.IEdge
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * A void implementation of an edge style renderer that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer">Online Documentation</a>
 */
external  class VoidEdgeStyleRenderer 
private constructor () : IEdgeStyleRenderer {

/**
 * Yields the [IBoundsProvider.EMPTY] that will return empty bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( edge: IEdge ,
 style: IEdgeStyle ):IBoundsProvider
/**
 * Yields a lookup that will only return [LassoTestables.NEVER][yfiles.input.LassoTestables.NEVER] if an [ILassoTestable][yfiles.input.ILassoTestable] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( edge: IEdge ,
 style: IEdgeStyle ):ILookup
/**
 * Yields the [IHitTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 final override   fun getHitTestable( edge: IEdge ,
 style: IEdgeStyle ):IHitTestable
/**
 * Yields the [IMarqueeTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 final override   fun getMarqueeTestable( edge: IEdge ,
 style: IEdgeStyle ):IMarqueeTestable
/**
 * This method always returns the [VoidPathGeometry instance][VoidPathGeometry.INSTANCE].
 * @param [edge] The edge to provide an instance for
 * @param [style] The style to use for the rendering
 * @return The [VoidPathGeometry instance][VoidPathGeometry.INSTANCE].
 * @see [IEdgeStyleRenderer.getPathGeometry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getPathGeometry">Online Documentation</a>
 */
 final override   fun getPathGeometry( edge: IEdge ,
 style: IEdgeStyle ):IPathGeometry
/**
 * Yields the [IVisibilityTestable.NEVER] that will always claim invisibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 final override   fun getVisibilityTestable( edge: IEdge ,
 style: IEdgeStyle ):IVisibilityTestable
/**
 * Yields the [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE] that will do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23VoidEdgeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( edge: IEdge ,
 style: IEdgeStyle ):IVisualCreator

companion object : ClassMetadata<VoidEdgeStyleRenderer> {
/**
 * The [VoidEdgeStyleRenderer] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidEdgeStyleRenderer%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IEdgeStyleRenderer
}
}
