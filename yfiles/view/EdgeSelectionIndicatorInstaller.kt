// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata

/**
 * An implementation of the [ICanvasObjectInstaller] interface that can install the selection outline of an [IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller%23EdgeSelectionIndicatorInstaller-constructor-EdgeSelectionIndicatorInstaller">Online Documentation</a>
 */
external open class EdgeSelectionIndicatorInstaller  () : EdgeDecorationInstaller {

/**
 * Retrieves the drawing of the bend for the context.
 * @param [canvas] The canvas for which the drawing shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The drawing instance to use for the rendering of the bends in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller%23EdgeSelectionIndicatorInstaller-method-getBendDrawing">Online Documentation</a>
 */
 override   fun getBendDrawing( canvas: CanvasComponent ,
 edge: IEdge ):IVisualTemplate<IBend>?
/**
 * Retrieves the [Stroke] for the context.
 * @param [canvas] The canvas for which the [Stroke] shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The [Stroke] instance to use for the rendering of the edge in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller%23EdgeSelectionIndicatorInstaller-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke( canvas: CanvasComponent ,
 edge: IEdge ):Stroke?

companion object : ClassMetadata<EdgeSelectionIndicatorInstaller> {
/**
 * A [String] that will be used to find the [IVisualTemplate] that will be used to draw the bends of the edge.
 * 
 * The default template has the `yfiles-bend-template` CSS class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller%23BEND_TEMPLATE_KEY">Online Documentation</a>
 */
 val BEND_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IBend>>
/**
 * A [String] that will be used to find the [Stroke] that will be used to draw the path of the edge.
 * 
 * The default selection template provides the `yfiles-selection-template` and `yfiles-edge-selection-template` CSS classes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSelectionIndicatorInstaller%23STROKE_KEY">Online Documentation</a>
 */
 val STROKE_KEY: ResourceKey<Stroke>
}
}

inline fun EdgeSelectionIndicatorInstaller(
    block: EdgeSelectionIndicatorInstaller.() -> Unit
): EdgeSelectionIndicatorInstaller {
    return EdgeSelectionIndicatorInstaller()
        .apply(block)
}
