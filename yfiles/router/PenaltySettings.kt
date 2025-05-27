// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides the cost penalties that are applied for violating restrictions during a [PathSearch].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PenaltySettings].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23PenaltySettings-constructor-PenaltySettings">Online Documentation</a>
 */
external open class PenaltySettings 
protected constructor () : YObject {

/**
 * Gets or sets the penalty for a crossing of two edges that are *adjacent*, that is, share a common node.
 * 
 * Default value - `7`
 * @see [edgeCrossingPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23adjacentEdgeCrossingPenalty">Online Documentation</a>
 */
open var adjacentEdgeCrossingPenalty: Double
/**
 * Gets or sets the penalty for an edge bend.
 * 
 * Default value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23bendPenalty">Online Documentation</a>
 */
open var bendPenalty: Double
/**
 * Gets or sets the penalty for an edge bend being closer to the border of the source node, the target node or one of their ancestor group nodes than the minimum node to edge distance.
 * 
 * Default value - `10`
 * @see [EdgeRouter.minimumNodeToEdgeDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23bendsInNodeToEdgeDistancePenalty">Online Documentation</a>
 */
open var bendsInNodeToEdgeDistancePenalty: Double
/**
 * Gets or sets the penalty for a crossing of two edges.
 * 
 * Default value - `1`
 * @see [adjacentEdgeCrossingPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23edgeCrossingPenalty">Online Documentation</a>
 */
open var edgeCrossingPenalty: Double
/**
 * Gets or sets the penalty for an edge crossing an edge label.
 * 
 * Default value - `13`
 * @see [EdgeRouter.considerEdgeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23edgeLabelCrossingPenalty">Online Documentation</a>
 */
open var edgeLabelCrossingPenalty: Double
/**
 * Gets or sets the penalty for the edge length.
 * 
 * Default value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23edgeLengthPenalty">Online Documentation</a>
 */
open var edgeLengthPenalty: Double
/**
 * Gets or sets the penalty for an edge crossing a group node.
 * 
 * Default value - `60`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23groupNodeCrossingPenalty">Online Documentation</a>
 */
open var groupNodeCrossingPenalty: Double
/**
 * Gets or sets the penalty for an edge with a group ID that is not grouped at source or target side.
 * 
 * Default value - `25`
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23invalidEdgeGroupingPenalty">Online Documentation</a>
 */
open var invalidEdgeGroupingPenalty: Double
/**
 * Gets or sets the penalty for violations of the minimum distance between any two edges.
 * 
 * Default value - `5`
 * @see [EdgeLayoutDescriptor.minimumEdgeToEdgeDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23minimumEdgeToEdgeDistancePenalty">Online Documentation</a>
 */
open var minimumEdgeToEdgeDistancePenalty: Double
/**
 * Gets or sets the penalty for violations of the minimum length of the first and last segment of an edge.
 * 
 * Default value - `12`
 * @see [EdgeLayoutDescriptor.minimumFirstSegmentLength]
 * @see [EdgeLayoutDescriptor.minimumLastSegmentLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23minimumFirstLastSegmentLengthPenalty">Online Documentation</a>
 */
open var minimumFirstLastSegmentLengthPenalty: Double
/**
 * Gets or sets the penalty for violations of the minimum distance between any edge and any group node side.
 * 
 * Default value - `10`
 * @see [EdgeRouter.minimumNodeToEdgeDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23minimumGroupNodeToEdgeDistancePenalty">Online Documentation</a>
 */
open var minimumGroupNodeToEdgeDistancePenalty: Double
/**
 * Gets or sets the penalty for violations of the minimum distance the edge shall maintain from node corners when entering or leaving the node.
 * 
 * Default value - `6`
 * @see [EdgeLayoutDescriptor.minimumNodeCornerDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23minimumNodeCornerDistancePenalty">Online Documentation</a>
 */
open var minimumNodeCornerDistancePenalty: Double
/**
 * Gets or sets the penalty for violations of the minimum distance between any edge and any normal node side.
 * 
 * Default value - `10`
 * @see [EdgeRouter.minimumNodeToEdgeDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23minimumNodeToEdgeDistancePenalty">Online Documentation</a>
 */
open var minimumNodeToEdgeDistancePenalty: Double
/**
 * Gets or sets the penalty for violating the monotonic path restrictions of an edge.
 * 
 * Default value - `14`
 * @see [EdgeLayoutDescriptor.monotonicPathRestriction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23monotonyViolationPenalty">Online Documentation</a>
 */
open var monotonyViolationPenalty: Double
/**
 * Gets or sets the penalty for an edge crossing a regular node.
 * 
 * Default value - `3000`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23nodeCrossingPenalty">Online Documentation</a>
 */
open var nodeCrossingPenalty: Double
/**
 * Gets or sets the penalty for an edge crossing a node label.
 * 
 * Default value - `13`
 * @see [EdgeRouter.considerNodeLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23nodeLabelCrossingPenalty">Online Documentation</a>
 */
open var nodeLabelCrossingPenalty: Double
/**
 * Gets or sets the penalty for an edge leaving and reentering in the same [partition grid][yfiles.layout.PartitionGrid] cell.
 * 
 * Default value - `7`
 * @see [PartitionGrid][yfiles.layout.PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23partitionGridCellReentrancePenalty">Online Documentation</a>
 */
open var partitionGridCellReentrancePenalty: Double
/**
 * Gets or sets the penalty for an edge that crosses a fixed port location of another edge.
 * 
 * Default value - `13`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23portCrossingPenalty">Online Documentation</a>
 */
open var portCrossingPenalty: Double
/**
 * Gets or sets the penalty if an edge does not comply with its [PortCandidate][yfiles.layout.PortCandidate]s or [PortConstraint][yfiles.layout.PortConstraint]s.
 * 
 * Default value - `10000`
 * @see [PortCandidate][yfiles.layout.PortCandidate]
 * @see [PortConstraint][yfiles.layout.PortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23portViolationPenalty">Online Documentation</a>
 */
open var portViolationPenalty: Double
/**
 * Gets or sets the penalty for a crossing of two segments that belong the same edge.
 * 
 * Default value - `50`
 * @see [edgeCrossingPenalty]
 * @see [adjacentEdgeCrossingPenalty]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23selfCrossingPenalty">Online Documentation</a>
 */
open var selfCrossingPenalty: Double
/**
 * Gets or sets the penalty for bends of a self-loop edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23singleSideSelfLoopPenalty">Online Documentation</a>
 */
open var singleSideSelfLoopPenalty: Double
/**
 * Gets or sets the penalty for deviating from the original edge path if the [routing policy][EdgeLayoutDescriptor.routingPolicy] is set to [RoutingPolicy.SEGMENTS_AS_NEEDED].
 * 
 * Default value - `4.5`
 * @see [RoutingPolicy.SEGMENTS_AS_NEEDED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23sketchViolationPenalty">Online Documentation</a>
 */
open var sketchViolationPenalty: Double
/**
 * Creates a copy of this [PenaltySettings] instance.
 * @return a copy of this instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23PenaltySettings-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():PenaltySettings
/**
 * Creates a new instance of [PenaltySettings].
 * @return a specialized [PenaltySettings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23PenaltySettings-method-newInstance">Online Documentation</a>
 */
 open protected   fun newInstance():PenaltySettings

companion object : ClassMetadata<PenaltySettings> {
/**
 * Optimization strategy that balances bends and edge crossings in the edge routes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23OPTIMIZATION_BALANCED">Online Documentation</a>
 */
 val OPTIMIZATION_BALANCED: PenaltySettings
/**
 * Optimization strategy that minimizes bends in the edge routes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23OPTIMIZATION_EDGE_BENDS">Online Documentation</a>
 */
 val OPTIMIZATION_EDGE_BENDS: PenaltySettings
/**
 * Optimization strategy that minimizes edge crossings in the edge routes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23OPTIMIZATION_EDGE_CROSSINGS">Online Documentation</a>
 */
 val OPTIMIZATION_EDGE_CROSSINGS: PenaltySettings
/**
 * Optimization strategy that minimizes the length of the edge routes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PenaltySettings%23OPTIMIZATION_EDGE_LENGTHS">Online Documentation</a>
 */
 val OPTIMIZATION_EDGE_LENGTHS: PenaltySettings
}
}
