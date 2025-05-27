// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout
import yfiles.layout.NodeLabelingPolicy

/**
 * This layout algorithm arranges a graph on a disk packing the nodes as dense as possible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CompactDiskLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-constructor-CompactDiskLayout">Online Documentation</a>
 */
external open class CompactDiskLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not to reserve space for node labels during layout calculation.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes on the disk.
 * 
 * Default value - `false`. The layout algorithm does not consider the initial coordinates of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets whether or not the layout algorithm automatically places node labels.
 * 
 * Default value - `false`. Node labels are not placed by this algorithm.
 * @see [nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23integratedNodeLabeling">Online Documentation</a>
 */
open var integratedNodeLabeling: Boolean
/**
 * Gets or sets the minimum node distance that this algorithm should enforce between all pairs of nodes.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified minimum node distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets the spacing used for node labels when integrated node labeling is enabled.
 * 
 * Default value - `4.0`
 * @throws ArgumentError if the given spacing value is negative
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23nodeLabelSpacing">Online Documentation</a>
 */
open var nodeLabelSpacing: Double
/**
 * Gets or sets the policy defining how node labels are placed by the integrated node labeling mechanism (for example, the desired label orientation).
 * 
 * Default value - [NodeLabelingPolicy.RAY_LIKE_LEAVES]
 * @throws ArgumentError if an unknown labeling policy is given
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23nodeLabelingPolicy">Online Documentation</a>
 */
open var nodeLabelingPolicy: NodeLabelingPolicy
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<CompactDiskLayout> {
}
}

inline fun CompactDiskLayout(
    block: CompactDiskLayout.() -> Unit
): CompactDiskLayout {
    return CompactDiskLayout()
        .apply(block)
}
