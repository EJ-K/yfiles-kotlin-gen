// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.collections.ICollection
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class represents a candidate port on which edges can be connected to their source and/or target node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate">Online Documentation</a>
 */
external open class PortCandidate  : YObject {

/**
 * Gets the penalty cost for using this [PortCandidate] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23cost">Online Documentation</a>
 */
open val cost: Double
/**
 * Gets the direction of this [PortCandidate].
 * @see [getDirectionForLayoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23direction">Online Documentation</a>
 */
open val direction: PortDirections
/**
 * Gets whether or not this [PortCandidate] is fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23fixed">Online Documentation</a>
 */
open val fixed: Boolean
/**
 * Gets the X-offset of the [PortCandidate] with respect to the center of the corresponding node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23xOffset">Online Documentation</a>
 */
open val xOffset: Double
/**
 * Gets the Y-offset of the [PortCandidate] with respect to the center of the corresponding node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23yOffset">Online Documentation</a>
 */
open val yOffset: Double
/**
 * Returns the direction of this [PortCandidate] instance with respect to the given [layout orientation][OrientationLayout.orientation].
 * @return the direction of this [PortCandidate] with respect to the given layout orientation
 * @see [direction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-getDirectionForLayoutOrientation">Online Documentation</a>
 */
 open   fun getDirectionForLayoutOrientation( layoutOrientation: LayoutOrientation ):PortDirections
/**
 * Returns the X-offset of the [PortCandidate] with respect to the center of the corresponding node for the given [layout orientation][OrientationLayout.orientation].
 * @param [layoutOrientation] the layout orientation
 * @return the X-offset of the [PortCandidate] with respect to the given layout orientation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-getXOffsetForLayoutOrientation(LayoutOrientation)">Online Documentation</a>
 */
 open   fun getXOffsetForLayoutOrientation( layoutOrientation: LayoutOrientation ):Double
/**
 * Returns the X-offset of the [PortCandidate] with respect to the center of the corresponding node for the given [layout orientation][OrientationLayout.orientation] and [mirror mask][OrientationLayout.mirrorMode].
 * @param [layoutOrientation] the layout orientation
 * @param [mirrorMask] the mirror mask
 * @return the X-offset of the port with respect to the given orientation and mirror mask
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-getXOffsetForLayoutOrientation(LayoutOrientation,MirrorModes)">Online Documentation</a>
 */
 open   fun getXOffsetForLayoutOrientation( layoutOrientation: LayoutOrientation ,
 mirrorMask: MirrorModes ):Double
/**
 * Returns the Y-offset of the [PortCandidate] with respect to the center of the corresponding node for the given [layout orientation][OrientationLayout.orientation].
 * @param [layoutOrientation] the layout orientation
 * @return the Y-offset of the [PortCandidate] with respect to the given layout orientation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-getYOffsetForLayoutOrientation(LayoutOrientation)">Online Documentation</a>
 */
 open   fun getYOffsetForLayoutOrientation( layoutOrientation: LayoutOrientation ):Double
/**
 * Returns the Y-offset of the [PortCandidate] with respect to the center of the corresponding node for the given [layout orientation][OrientationLayout.orientation] and [mirror mask][OrientationLayout.mirrorMode].
 * @param [layoutOrientation] the layout orientation
 * @param [mirrorMask] the mirror mask
 * @return the Y-offset of the [PortCandidate] with respect to the given orientation and mirror mask
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-getYOffsetForLayoutOrientation(LayoutOrientation,MirrorModes)">Online Documentation</a>
 */
 open   fun getYOffsetForLayoutOrientation( layoutOrientation: LayoutOrientation ,
 mirrorMask: MirrorModes ):Double
/**
 * Returns whether or not this [PortCandidate] lies in the given direction.
 * @param [directionMask] one of the default direction specifiers
 * @return `true` if this [PortCandidate] lies in the given direction, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-isInDirection">Online Documentation</a>
 */
 open   fun isInDirection( directionMask: PortDirections ):Boolean
/**
 * A utility method that converts the current [PortCandidate] instance to a [PortConstraint].
 * @return a [PortConstraint] that matches this [PortCandidate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-toPortConstraint">Online Documentation</a>
 */
 open   fun toPortConstraint():PortConstraint
/**
 * A utility method that converts the current [PortCandidate] instance to a [PortConstraint] with respect to the given [layout orientation][OrientationLayout.orientation].
 * @return a [PortConstraint] that matches this [PortCandidate] with respect to the given orientation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-toPortConstraintForLayoutOrientation">Online Documentation</a>
 */
 open   fun toPortConstraintForLayoutOrientation( layoutOrientation: LayoutOrientation ):PortConstraint

companion object : ClassMetadata<PortCandidate> {
/**
 * A data provider key for specifying source port candidates for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY">Online Documentation</a>
 */
 val SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY: EdgeDpKey<ICollection<out PortCandidate>>
/**
 * A data provider key for specifying target port candidates for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY">Online Documentation</a>
 */
 val TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY: EdgeDpKey<ICollection<out PortCandidate>>
/**
 * Factory method that returns a free [PortCandidate] instance with zero cost of usage and the direction specified by the [side][PortConstraint.side] of the given [PortConstraint].
 * @param [fromPortConstraint] the [PortConstraint] whose [side][PortConstraint.side] should be used as direction
 * @return a new [PortCandidate] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-createCandidate(PortConstraint)">Online Documentation</a>
 */
@JsName("createCandidate")
 final  operator fun invoke( fromPortConstraint: PortConstraint ):PortCandidate
/**
 * Factory method that creates a free [PortCandidate] instance with the given direction and cost of usage.
 * @param [directionMask] any combination of the default direction specifiers
 * @param [cost] the penalty cost for using this [PortCandidate]
 * @return a new [PortCandidate] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-createCandidate(PortDirections,number)">Online Documentation</a>
 */
@JsName("createCandidate")
 final  operator fun invoke( directionMask: PortDirections ,
 cost: Double  = definedExternally):PortCandidate
/**
 * Factory method that creates a fixed [PortCandidate] instance with the given cost of usage, direction and offset values.
 * @param [xOffset] the X-offset relative to the center of the node
 * @param [yOffset] the Y-offset relative to the center of the node
 * @param [directionMask] any combination of the default direction specifiers
 * @param [cost] the penalty cost for using this [PortCandidate] instance
 * @return a new [PortCandidate] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidate%23PortCandidate-method-createCandidate(number,number,PortDirections,number)">Online Documentation</a>
 */
@JsName("createCandidate")
 final  operator fun invoke( xOffset: Double ,
 yOffset: Double ,
 directionMask: PortDirections ,
 cost: Double  = definedExternally):PortCandidate
}
}
