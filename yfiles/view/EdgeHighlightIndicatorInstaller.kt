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
 * An specialized subclass of the [EdgeSelectionIndicatorInstaller] that can install the highlight rendering of an [IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller%23EdgeHighlightIndicatorInstaller-constructor-EdgeHighlightIndicatorInstaller">Online Documentation</a>
 */
external open class EdgeHighlightIndicatorInstaller  () : EdgeDecorationInstaller {

/**
 * Retrieves the drawing of the bend for the context.
 * @param [canvas] The context for which the drawing shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The drawing instance to use for the rendering of the bends in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller%23EdgeHighlightIndicatorInstaller-method-getBendDrawing">Online Documentation</a>
 */
 override   fun getBendDrawing( canvas: CanvasComponent ,
 edge: IEdge ):IVisualTemplate<IBend>?
/**
 * Retrieves the [Stroke] for the context.
 * @param [canvas] The canvas for which the [Stroke] shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The [Stroke] instance to use for the rendering of the edge in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller%23EdgeHighlightIndicatorInstaller-method-getStroke">Online Documentation</a>
 */
 override   fun getStroke( canvas: CanvasComponent ,
 edge: IEdge ):Stroke?

companion object : ClassMetadata<EdgeHighlightIndicatorInstaller> {
/**
 * A [String] that will be used to find the [IVisualTemplate] that will be used to draw the bends of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller%23BEND_TEMPLATE_KEY">Online Documentation</a>
 */
 val BEND_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IBend>>
/**
 * A [String] that will be used to find the [Stroke] that will be used to draw the path of the edge.
 * 
 * The default highlight template provides the `yfiles-highlight-template` and `yfiles-edge-highlight-template` CSS classes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeHighlightIndicatorInstaller%23STROKE_KEY">Online Documentation</a>
 */
 val STROKE_KEY: ResourceKey<Stroke>
}
}

inline fun EdgeHighlightIndicatorInstaller(
    block: EdgeHighlightIndicatorInstaller.() -> Unit
): EdgeHighlightIndicatorInstaller {
    return EdgeHighlightIndicatorInstaller()
        .apply(block)
}
