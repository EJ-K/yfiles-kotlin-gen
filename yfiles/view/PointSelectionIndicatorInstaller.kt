// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.IPoint
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * An [ISelectionIndicatorInstaller] implementation that draws an ellipse centered at a given point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller">Online Documentation</a>
 * 
 * @constructor Creates a selection indicator that indicates a point.
 * @param [point] The point to use for the center of the painting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23PointSelectionIndicatorInstaller-constructor-PointSelectionIndicatorInstaller">Online Documentation</a>
 */
external open class PointSelectionIndicatorInstaller<T : IModelItem>  ( point: IPoint ) : ISelectionIndicatorInstaller<T> {

/**
 * Gets or sets the [Fill] to use for filling the point's ellipse in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23fill">Online Documentation</a>
 */
final var fill: Fill?
/**
 * Gets or sets the [Stroke] to use for drawing the point in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets a value indicating whether the visualization is drawn in view coordinates, instead of intermediate coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23PointSelectionIndicatorInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: T ):ICanvasObject?
/**
 * Factory method that retrieves the center for a given user object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PointSelectionIndicatorInstaller%23PointSelectionIndicatorInstaller-method-getCenterPoint">Online Documentation</a>
 */
 open protected   fun getCenterPoint( userObject: T ):IPoint?

companion object : ClassMetadata<PointSelectionIndicatorInstaller<*>> {
}
}
