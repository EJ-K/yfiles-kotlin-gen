// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.view.ResourceKey
import yfiles.view.Stroke

/**
 * A snap line is a line segment in the world coordinate system to which other items (lines or points) snap during interactive movements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine">Online Documentation</a>
 * 
 * @constructor Creates a new snap line using the provided attributes.
 * @param [snapType] The type of the line that describes how other items will snap to this line. This is one of [SnapLineSnapTypes.TOP], [SnapLineSnapTypes.BOTTOM], [SnapLineSnapTypes.LEFT], [SnapLineSnapTypes.RIGHT], or [SnapLineSnapTypes.CENTER].
 * @param [visualizationType] The type of the visual representation of this snap line.
 * @param [coordinates] The coordinates of the center point of the snap line.
 * @param [from] The first location that delimits this snap line.
 * @param [to] The second location that delimits this snap line.
 * @param [tag] A tag that is associated with this snap line - see [tag] for a typical use of this value.
 * @param [weight] The weight (importance) of this snap line. If more than one snap line is snapped to, the one with the greater weight will be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23SnapLine-constructor-SnapLine">Online Documentation</a>
 * 
 * @property snapType
 * Gets the type of the line that describes how other items will snap to this line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23snapType">Online Documentation</a>
 * 
 * @property visualizationType
 * Gets the visualization type which determines the visual appearance of the snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23visualizationType">Online Documentation</a>
 * 
 * @property coordinates
 * Gets the coordinates of the center point of the snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23coordinates">Online Documentation</a>
 * 
 * @property from
 * Gets or sets the first location that delimits this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23from">Online Documentation</a>
 * 
 * @property to
 * Gets or sets the second location that delimits this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23to">Online Documentation</a>
 * 
 * @property tag
 * Gets the tag that is associated with this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23tag">Online Documentation</a>
 * 
 * @property weight
 * Gets the weight/importance of this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23weight">Online Documentation</a>
 */
external open class SnapLine  (
final val snapType: SnapLineSnapTypes,
final val visualizationType: SnapLineVisualizationType,
final val coordinates: Point,
final var from: Point,
final var to: Point,
final val tag: Tag?,
final val weight: Double) : YObject {

companion object : ClassMetadata<SnapLine> {
/**
 * Resource key which determines the [Stroke] used for the snap line visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapLine%23SNAP_LINE_STROKE_KEY">Online Documentation</a>
 */
 val SNAP_LINE_STROKE_KEY: ResourceKey<Stroke>
}
}
