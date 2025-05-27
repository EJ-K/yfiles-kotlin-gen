// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This class implements a [layout stage][yfiles.layout.ILayoutStage] that handles a given [partition grid][yfiles.layout.PartitionGrid] structure.
 * @see [PartitionGrid][yfiles.layout.PartitionGrid]
 * @see [HierarchicLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartitionGridLayoutStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridLayoutStage%23PartitionGridLayoutStage-constructor-PartitionGridLayoutStage">Online Documentation</a>
 */
external open class PartitionGridLayoutStage  () : LayoutStageBase {

/**
 * Calculates the layout based on a [PartitionGrid][yfiles.layout.PartitionGrid] structure.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionGridLayoutStage%23PartitionGridLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<PartitionGridLayoutStage> {
}
}

inline fun PartitionGridLayoutStage(
    block: PartitionGridLayoutStage.() -> Unit
): PartitionGridLayoutStage {
    return PartitionGridLayoutStage()
        .apply(block)
}
