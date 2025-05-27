// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.ILabelModel
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [PreferredPlacementDescriptor] provides placement information for automatic edge labeling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [PreferredPlacementDescriptor] instance that copies the given descriptor.
 * @param [descriptor] the [PreferredPlacementDescriptor] that is copied
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-constructor-PreferredPlacementDescriptor(PreferredPlacementDescriptor)">Online Documentation</a>
 */
external open class PreferredPlacementDescriptor  ( descriptor: PreferredPlacementDescriptor  = definedExternally) : YObject {

/**
 * Gets or sets the angle (in radians) for the label rotation.
 * 
 * Default value - `0`
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @see [angleReference]
 * @see [angleRotationOnRightSide]
 * @see [angleOffsetOnRightSide]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Gets or sets the angle offset for labels that are placed on the right side of the edge.
 * 
 * Default value - [LabelAngleOnRightSideOffsets.NONE]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @throws ArgumentError if the specified value is not valid angle offset
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23angleOffsetOnRightSide">Online Documentation</a>
 */
open var angleOffsetOnRightSide: LabelAngleOnRightSideOffsets
/**
 * Gets or sets the reference of the angle given by [angle].
 * 
 * Default value - [LabelAngleReferences.ABSOLUTE]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @throws ArgumentError if the specified value is not a valid angle reference
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23angleReference">Online Documentation</a>
 */
open var angleReference: LabelAngleReferences
/**
 * Gets or sets how the angle is applied to labels on the right side in respect of the labels of the left side of the edge.
 * 
 * Default value - [LabelAngleOnRightSideRotations.CLOCKWISE]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @throws ArgumentError if the specified value is not a valid angle rotation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23angleRotationOnRightSide">Online Documentation</a>
 */
open var angleRotationOnRightSide: LabelAngleOnRightSideRotations
/**
 * Gets or sets the preferred distance between a label and the corresponding edge segment.
 * 
 * Default value - `-1`
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @throws ArgumentError if the specified value is infinite or `NaN`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23distanceToEdge">Online Documentation</a>
 */
open var distanceToEdge: Double
/**
 * Gets whether or not one of the angle interpretations is absolute.
 * @see [LabelAngleReferences.ABSOLUTE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleAbsolute">Online Documentation</a>
 */
open val isAngleAbsolute: Boolean
/**
 * Gets whether or not one of the angle interpretations is to add an angle offset of `180` degrees to labels that are right of the edge.
 * @see [isRightOfEdge]
 * @see [LabelAngleOnRightSideOffsets.SEMI]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleOffsetOnRightSide180">Online Documentation</a>
 */
open val isAngleOffsetOnRightSide180: Boolean
/**
 * Gets whether or not one of the angle interpretations is to add no angle offset to labels that are right of the edge.
 * @see [isRightOfEdge]
 * @see [LabelAngleOnRightSideOffsets.NONE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleOffsetOnRightSideZero">Online Documentation</a>
 */
open val isAngleOffsetOnRightSideZero: Boolean
/**
 * Gets whether or not one of the angle interpretations is to rotate the angle of labels that are right of the edge co-rotating with the labels left of or centered on the edge, i.e., the angle of all labels is interpreted clockwise.
 * @see [isRightOfEdge]
 * @see [LabelAngleOnRightSideRotations.CLOCKWISE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleOnRightSideCoRotating">Online Documentation</a>
 */
open val isAngleOnRightSideCoRotating: Boolean
/**
 * Gets whether or not one of the angle interpretations is to rotate the angle of labels that are right of the edge counter-rotating with the labels left of or centered on the edge, i.e., the angle of labels left or centered on edge is interpreted clockwise while the angle of labels right of edge is interpreted counter-clockwise.
 * @see [isRightOfEdge]
 * @see [LabelAngleOnRightSideRotations.COUNTER_CLOCKWISE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleOnRightSideCounterRotating">Online Documentation</a>
 */
open val isAngleOnRightSideCounterRotating: Boolean
/**
 * Gets whether or not one of the angle interpretation is relative to the edge slope.
 * @see [LabelAngleReferences.RELATIVE_TO_EDGE_FLOW]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAngleRelativeToEdgeFlow">Online Documentation</a>
 */
open val isAngleRelativeToEdgeFlow: Boolean
/**
 * Gets whether or not one of the preferred placement locations for this label is at center.
 * @see [LabelPlacements.AT_CENTER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAtCenter">Online Documentation</a>
 */
open val isAtCenter: Boolean
/**
 * Gets whether or not one of the preferred placement locations for this label is at source.
 * @see [LabelPlacements.AT_SOURCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAtSource">Online Documentation</a>
 */
open val isAtSource: Boolean
/**
 * Gets whether or not one of the preferred placements for this label is at the source port.
 * @see [LabelPlacements.AT_SOURCE_PORT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAtSourcePort">Online Documentation</a>
 */
open val isAtSourcePort: Boolean
/**
 * Gets whether or not one of the preferred placements for this label is at target.
 * @see [LabelPlacements.AT_TARGET]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAtTarget">Online Documentation</a>
 */
open val isAtTarget: Boolean
/**
 * Gets whether or not one of the preferred placements for this label is at the target port.
 * @see [LabelPlacements.AT_TARGET_PORT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isAtTargetPort">Online Documentation</a>
 */
open val isAtTargetPort: Boolean
/**
 * Gets whether or not one of the preferred sides for this label is left of the edge.
 * @see [LabelPlacements.LEFT_OF_EDGE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isLeftOfEdge">Online Documentation</a>
 */
open val isLeftOfEdge: Boolean
/**
 * Gets whether or not one of the preferred sides for this label is on the edge.
 * @see [LabelPlacements.ON_EDGE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isOnEdge">Online Documentation</a>
 */
open val isOnEdge: Boolean
/**
 * Gets whether or not one of the preferred sides for this label is right of the edge.
 * @see [LabelPlacements.RIGHT_OF_EDGE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isRightOfEdge">Online Documentation</a>
 */
open val isRightOfEdge: Boolean
/**
 * Gets whether or not the preferred side specified by [sideOfEdge] is interpreted absolute, and on horizontal segments, labels with preferred side [LabelPlacements.LEFT_OF_EDGE] are placed above the segment.
 * @see [LabelSideReferences.ABSOLUTE_WITH_LEFT_IN_NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isSideAbsoluteWithLeftInNorth">Online Documentation</a>
 */
open val isSideAbsoluteWithLeftInNorth: Boolean
/**
 * Gets whether or not the preferred side specified by [sideOfEdge] is interpreted absolute, and on horizontal segments, labels with preferred side [LabelPlacements.RIGHT_OF_EDGE] are placed above the segment.
 * @see [LabelSideReferences.ABSOLUTE_WITH_RIGHT_IN_NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isSideAbsoluteWithRightInNorth">Online Documentation</a>
 */
open val isSideAbsoluteWithRightInNorth: Boolean
/**
 * Gets whether or not the preferred side specified by [sideOfEdge] is interpreted relative to the edge flow.
 * @see [LabelSideReferences.RELATIVE_TO_EDGE_FLOW]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23isSideRelativeToEdgeFlow">Online Documentation</a>
 */
open val isSideRelativeToEdgeFlow: Boolean
/**
 * Gets or sets the preferred placement along the edge.
 * 
 * Default value - [LabelPlacements.AT_CENTER]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23placeAlongEdge">Online Documentation</a>
 */
open var placeAlongEdge: LabelPlacements
/**
 * Gets or sets the preferred side of the edge.
 * 
 * Default value - [LabelPlacements.ON_EDGE]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23sideOfEdge">Online Documentation</a>
 */
open var sideOfEdge: LabelPlacements
/**
 * Gets or sets how to interpret the preferred side as given by [sideOfEdge].
 * 
 * Default value - [LabelSideReferences.RELATIVE_TO_EDGE_FLOW]
 * @throws InvalidOperationError if this instance is [immutable][isFrozen]
 * @throws ArgumentError if the specified side reference is invalid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23sideReference">Online Documentation</a>
 */
open var sideReference: LabelSideReferences
/**
 * Clones this instance by returning a [YObject.memberwiseClone] or this in case this instance is already [frozen][isFrozen].
 * @return An instance of the same type as this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-method-clone">Online Documentation</a>
 */
 open   fun clone():PreferredPlacementDescriptor
/**
 * Makes this [PreferredPlacementDescriptor] instance immutable.
 * @see [isFrozen]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-method-freeze">Online Documentation</a>
 */
 open   fun freeze()
/**
 * Returns whether or not this is an immutable instance of [PreferredPlacementDescriptor].
 * @return `true` if this instance is immutable, `false` otherwise
 * @see [freeze]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-method-isFrozen">Online Documentation</a>
 */
 open   fun isFrozen():Boolean

companion object : ClassMetadata<PreferredPlacementDescriptor> {
/**
 * Returns a [PreferredPlacementDescriptor] which matches positions supported by the given `labelModel`.
 * @param [labelModel] The [ILabelModel] to get a [PreferredPlacementDescriptor] for.
 * @return A [PreferredPlacementDescriptor] which matches the given [ILabelModel] as good as possible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-defaultmethod-fromModel">Online Documentation</a>
 */
   fun fromModel( labelModel: ILabelModel ):PreferredPlacementDescriptor
/**
 * Returns a [PreferredPlacementDescriptor] which matches the given `parameter` best.
 * @param [parameter] The [ILabelModelParameter] to get a [PreferredPlacementDescriptor] for.
 * @return A [PreferredPlacementDescriptor] which matches the given [ILabelModelParameter] as good as possible.
 * @throws ArgumentError If the given `parameter` has a known [ILabelModelParameter.model] but the `parameter`'s type is not known.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-defaultmethod-fromParameter">Online Documentation</a>
 */
   fun fromParameter( parameter: ILabelModelParameter ):PreferredPlacementDescriptor
/**
 * Returns an immutable descriptor instance for the specified placement.
 * @param [placement] a combination of valid placements along the edge and valid sides of the edge
 * @return an immutable descriptor instance for the specified placement
 * @see [isFrozen]
 * @see [placeAlongEdge]
 * @see [sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PreferredPlacementDescriptor%23PreferredPlacementDescriptor-method-newSharedInstance">Online Documentation</a>
 */
 final   fun newSharedInstance( placement: LabelPlacements ):PreferredPlacementDescriptor
}
}

inline fun PreferredPlacementDescriptor(
    block: PreferredPlacementDescriptor.() -> Unit
): PreferredPlacementDescriptor {
    return PreferredPlacementDescriptor()
        .apply(block)
}
