// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Graph
import yfiles.algorithms.YVector
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * [EdgeLabelOrientationSupport] provides orientation and mirroring support for [layout algorithms][ILayoutAlgorithm] with integrated edge labeling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeLabelOrientationSupport] instance.
 * @see [OrientationLayout.considerEdgeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-constructor-EdgeLabelOrientationSupport">Online Documentation</a>
 */
external open class EdgeLabelOrientationSupport  () : YObject {

/**
 * Creates and returns a non-ambiguous [PreferredPlacementDescriptor] of the given potentially ambiguous one.
 * @param [ambiguous] an ambiguous [PreferredPlacementDescriptor]
 * @return a non-ambiguous version of the given ambiguous [PreferredPlacementDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-createNonAmbiguous">Online Documentation</a>
 */
 open protected   fun createNonAmbiguous( ambiguous: PreferredPlacementDescriptor ):PreferredPlacementDescriptor
/**
 * Marks the given port label for a non-port placement (fallback).
 * @param [portLabel] an edge label that had a [LabelPlacements.AT_SOURCE_PORT] or [LabelPlacements.AT_TARGET_PORT] placement preference
 * @throws InvalidOperationError if [replaceAmbiguousLabelDescriptors] was never called for the graph containing the given label.
 * @see [LabelPlacements.AT_SOURCE_PORT]
 * @see [LabelPlacements.AT_TARGET_PORT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-markPortLabelForFallbackPlacement">Online Documentation</a>
 */
 open   fun markPortLabelForFallbackPlacement( portLabel: LabelLayoutData )
/**
 * Restores the original preferred placement and updates the label rotation according to the layout orientation.
 * @param [graph] the graph to get the orientation information from
 * @param [label] the information about the edge label whose location is determined
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-postProcessLabel">Online Documentation</a>
 */
 open   fun postProcessLabel( graph: Graph ,
 label: LabelLayoutData )
/**
 * Prepares the label for the core layout algorithm.
 * @param [graph] the graph to get the orientation information from
 * @param [label] the information about the edge label whose segment direction is determined
 * @param [segmentDirection] the direction of the segment the edge label belongs to
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-preProcessLabel">Online Documentation</a>
 */
 open   fun preProcessLabel( graph: Graph ,
 label: LabelLayoutData ,
 segmentDirection: Direction )
/**
 * Replaces the [PreferredPlacementDescriptor]s of all edge labels in the given graph with non-ambiguous descriptors.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-replaceAmbiguousLabelDescriptors">Online Documentation</a>
 */
 open   fun replaceAmbiguousLabelDescriptors( graph: Graph )
/**
 * Restores the [PreferredPlacementDescriptor]s of all edge labels in the given graph with their original descriptors.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-resetAmbiguousLabelDescriptors">Online Documentation</a>
 */
 open   fun resetAmbiguousLabelDescriptors( graph: Graph )

companion object : ClassMetadata<EdgeLabelOrientationSupport> {
/**
 * Calculates the up vector of an edge label considering the preferred placement of the label as well as the direction of the edge segment the label is attached to.
 * @param [descriptor] the data describing the preferred label orientation
 * @param [segmentDirection] the direction the edge segment is pointing to
 * @return the up vector for the edge label that considers the preferred placement of the label as well as the direction of the edge segment the label is attached to
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-getEdgeLabelUpVector">Online Documentation</a>
 */
 final   fun getEdgeLabelUpVector( descriptor: PreferredPlacementDescriptor ,
 segmentDirection: Direction ):YVector
/**
 * Calculates the up vector for a label whose right vector is rotated clockwise by the given angle.
 * @param [rightVectorAngle] the angle in radians the right vector is rotated by
 * @return the up vector for a label whose right vector is rotated clockwise by the given angle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-getLabelUpVector">Online Documentation</a>
 */
 final   fun getLabelUpVector( rightVectorAngle: Double ):YVector
/**
 * Transforms a direction of the layout to the oriented layout direction.
 * @param [direction] direction in the layout
 * @param [orientation] the orientation of the layout
 * @param [mirrorMask] the mask to determine whether or not the orientation is mirrored
 * @return the direction in the oriented layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-getOrientedDirection">Online Documentation</a>
 */
 final   fun getOrientedDirection( direction: Direction ,
 orientation: LayoutOrientation ,
 mirrorMask: MirrorModes ):Direction
/**
 * Returns whether or not the orientation is mirrored.
 * @param [orientation] the orientation of the layout
 * @param [mirrorMask] the mask to determine whether or not the orientation is mirrored
 * @return `true` if the orientation is mirrored, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-isOrientationMirrored">Online Documentation</a>
 */
 final   fun isOrientationMirrored( orientation: LayoutOrientation ,
 mirrorMask: MirrorModes ):Boolean
/**
 * Calculates and sets the up vector of an edge label considering the preferred placement of the label as well as the direction of the edge segment the label is attached to.
 * @param [label] the data that describes the label orientation and is used for setting the new up vector
 * @param [segmentDirection] the direction the edge segment is pointing to
 * @see [getEdgeLabelUpVector]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeLabelOrientationSupport%23EdgeLabelOrientationSupport-method-updateLabelOrientation">Online Documentation</a>
 */
 final   fun updateLabelOrientation( label: LabelLayoutData ,
 segmentDirection: Direction )
}
}
