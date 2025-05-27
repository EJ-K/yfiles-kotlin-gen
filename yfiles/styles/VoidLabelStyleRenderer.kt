// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.view.IBoundsProvider
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator

/**
 * A void implementation of a label style renderer that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer">Online Documentation</a>
 */
external  class VoidLabelStyleRenderer 
private constructor () : ILabelStyleRenderer {

/**
 * Yields the [IBoundsProvider.EMPTY] that will return empty bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( label: ILabel ,
 style: ILabelStyle ):IBoundsProvider
/**
 * Yields a lookup that will only return [LassoTestables.NEVER][yfiles.input.LassoTestables.NEVER] if an [ILassoTestable][yfiles.input.ILassoTestable] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 style: ILabelStyle ):ILookup
/**
 * Yields the [IHitTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 final override   fun getHitTestable( label: ILabel ,
 style: ILabelStyle ):IHitTestable
/**
 * Yields the [IMarqueeTestable.NEVER] that will always report misses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 final override   fun getMarqueeTestable( label: ILabel ,
 style: ILabelStyle ):IMarqueeTestable
/**
 * Yields [Size.EMPTY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getPreferredSize">Online Documentation</a>
 */
 final override   fun getPreferredSize( label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Yields the [IVisibilityTestable.NEVER] that will always claim invisibility.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 final override   fun getVisibilityTestable( label: ILabel ,
 style: ILabelStyle ):IVisibilityTestable
/**
 * Yields the [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE] that will do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23VoidLabelStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( label: ILabel ,
 style: ILabelStyle ):IVisualCreator

companion object : ClassMetadata<VoidLabelStyleRenderer> {
/**
 * The singleton instance of this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidLabelStyleRenderer%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: ILabelStyleRenderer
}
}
