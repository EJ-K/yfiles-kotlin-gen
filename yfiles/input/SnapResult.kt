// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.IRectangle
import yfiles.geometry.Point
import yfiles.graph.ILabelModelParameter
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.view.IVisualCreator

/**
 * This is the abstract base class used by the implementers of [SnapContext] to model the result of the mouse being snapped to a certain location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult">Online Documentation</a>
 */
external abstract class SnapResult  : IComparable<SnapResult> {

/**
 * Gets the tag associated with this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23tag">Online Documentation</a>
 */
final var tag: Tag?
/**
 * Gets the weight of this result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23weight">Online Documentation</a>
 */
final var weight: Double
/**
 * Implements the [IComparable] interface using [weight].
 * @param [other] The second [SnapResult]
 * @return The comparison value of the two SnapResults' Weights
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-method-compareTo">Online Documentation</a>
 */
 final override  operator fun compareTo( other: SnapResult ):Int
/**
 * Returns a [IVisualCreator] instance that can be used to create a [Visual][yfiles.view.Visual] for this result.
 * @return A visual creator which creates a [Visual][yfiles.view.Visual] which depicts this snap result.
 * @see [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-method-getVisualCreator">Online Documentation</a>
 */
 abstract   fun getVisualCreator():IVisualCreator
/**
 * Checks whether this instance is still snapped given the final mouse location.
 * @param [unsnappedLocation] The unsnapped location.
 * @param [finalSnapState] The final snap state that has been used by the client.
 * @return Whether the location are still snapped for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-method-isSnapped">Online Documentation</a>
 */
 open   fun isSnapped( unsnappedLocation: Point ,
 finalSnapState: SnapState ):Boolean
/**
 * Core method that performs the actual snapping.
 * @param [unsnappedLocation] The location prior to the snapping.
 * @param [currentSnapState] The currently snapped location and the state of the snapping. This instance can be modified by subclasses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-method-snap">Online Documentation</a>
 */
 open   fun snap( unsnappedLocation: Point ,
 currentSnapState: SnapState )

companion object : ClassMetadata<SnapResult> {
/**
 * Gets a [SnapResult] representing that there is no snapping of the x or y coordinate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23NULL_RESULT">Online Documentation</a>
 */
 val NULL_RESULT: SnapResult
/**
 * Factory method that creates a [SnapResult] to which a [ILabel][yfiles.graph.ILabel] will snap, based on the given `snapLine`.
 * @param [layoutParameter] The [ILabelModelParameter] which represents the position to snap to.
 * @param [weight] The weight of this result. The higher the weight, the more important it is.
 * @param [delta] The value to add to the mouse coordinates to snap to this result.
 * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight] will be rendered.
 * @param [snapLine] The snap line this class would snap to or `null` if it doesn't snap to a `SnapLine`.
 * @param [snappedCoordinates] The coordinates at the moved item at which the drawn snap line should end.
 * @param [movedObject] The moved object for which this result is created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createLabelSnapResult">Online Documentation</a>
 */
   fun createLabelSnapResult( layoutParameter: ILabelModelParameter ,
 weight: Double ,
 delta: Point ,
 tag: Tag? ,
 snapLine: SnapLine? ,
 snappedCoordinates: Point ,
 movedObject: Any? ):SnapResult
/**
 * Factory method that creates a [SnapResult] that snaps to a given location.
 * @param [location] The location to snap to.
 * @param [weight] The weight to assign to the result.
 * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight] will be rendered.
 * @param [visualCreator] The visual creator to use.
 * @param [snapType] The type of the snapping operation to apply.
 * @return A result that snaps to the provided location using the provided mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createPointSnapResult">Online Documentation</a>
 */
   fun createPointSnapResult( location: Point ,
 weight: Double ,
 tag: Tag? ,
 visualCreator: IVisualCreator ,
 snapType: SnapTypes ):SnapResult
/**
 * Factory method that creates a [SnapResult] which snaps to a given size through a resize operation.
 * @param [weight] The weight of this result. The higher the weight, the more important it is.
 * @param [delta] The value to add to the mouse coordinates to snap to this result.
 * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight] will be rendered.
 * @param [rectangles] The rectangles that have the same width or height as the node will. The rectangle are used for visualization and should include all objects for which a visualization should be displayed. Typically, these are all objects which have the same size and the object which is currently reshaped.
 * @param [size] The target size to which the resized object will snap.
 * @param [horizontal] Indicates whether width or height should snap. `true` if the width should snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createResizeSnapResult">Online Documentation</a>
 */
   fun createResizeSnapResult( weight: Double ,
 delta: Point ,
 tag: Tag? ,
 rectangles: IEnumerable<IRectangle> ,
 size: Double ,
 horizontal: Boolean ):SnapResult
/**
 * Factory method that creates a [SnapResult] which represents a [SnapLine] to which the current moved item will potentially snap.
 * @param [weight] The weight of this result. The higher the weight, the more important it is.
 * @param [delta] The value to add to the mouse coordinates to snap to this result.
 * @param [tag] The tag associated with this result. If more than one result uses the same tag (not `null`), only the one with the highest [weight] will be rendered.
 * @param [snapLine] The snap line this class would snap to or `null` if it doesn't snap to a `SnapLine`.
 * @param [snappedLocation] The coordinates at the moved item at which the drawn snap line should end.
 * @param [movedObject] The moved object for which this result is created.
 * @param [preferredSnapTypes] Whether the cursor should preferably snap in horizontal or vertical direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapResult%23SnapResult-defaultmethod-createSnapLineSnapResult">Online Documentation</a>
 */
   fun createSnapLineSnapResult( weight: Double ,
 delta: Point ,
 tag: Tag? ,
 snapLine: SnapLine? ,
 snappedLocation: Point ,
 movedObject: Any? ,
 preferredSnapTypes: SnapTypes  = definedExternally):SnapResult
}
}
