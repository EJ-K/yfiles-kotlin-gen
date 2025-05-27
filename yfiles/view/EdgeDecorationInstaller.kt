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
 * An implementation of the [ICanvasObjectInstaller] interface that can decorate the visual appearance of an [IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorationInstaller">Online Documentation</a>
 */
external abstract class EdgeDecorationInstaller  : ISelectionIndicatorInstaller<IEdge>, IHighlightIndicatorInstaller<IEdge>, IFocusIndicatorInstaller<IEdge> {

/**
 * Gets or sets a value indicating whether to draw the decoration in in view coordinates, as opposed to intermediate coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorationInstaller%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * Installs a rendering for the `item` if it is an [IEdge] that will use the [getBendDrawing] and [getStroke] to render the path and bends.
 * @param [context] The canvas context.
 * @param [group] The [ICanvasObjectGroup] to add the new canvas object to.
 * @param [item] The item to install.
 * @return The canvas object representing the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorationInstaller%23EdgeDecorationInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: IEdge ):ICanvasObject?
/**
 * Retrieves the drawing of the bend for the context.
 * @param [canvas] The canvas for which the drawing shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The drawing instance to use for the rendering of the bends in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorationInstaller%23EdgeDecorationInstaller-method-getBendDrawing">Online Documentation</a>
 */
 abstract protected   fun getBendDrawing( canvas: CanvasComponent ,
 edge: IEdge ):IVisualTemplate<IBend>?
/**
 * Retrieves the [Stroke] for the context.
 * @param [canvas] The canvas for which the [Stroke] shall be returned.
 * @param [edge] The edge for which the rendering will be used.
 * @return The [Stroke] instance to use for the rendering of the edge in the given context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDecorationInstaller%23EdgeDecorationInstaller-method-getStroke">Online Documentation</a>
 */
 abstract protected   fun getStroke( canvas: CanvasComponent ,
 edge: IEdge ):Stroke?

companion object : ClassMetadata<EdgeDecorationInstaller> {
}
}
