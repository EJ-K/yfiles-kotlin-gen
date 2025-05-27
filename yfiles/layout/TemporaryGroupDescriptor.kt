// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YDimension
import yfiles.algorithms.YInsets
import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class allows specifying temporary groups for nodes that are considered by the [TemporaryGroupNodeInsertionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TemporaryGroupDescriptor] using the given descriptor as parent and the [layout algorithm][ILayoutAlgorithm] that is considered by the [RecursiveGroupLayout].
 * @param [parent] the parent temporary group of this group
 * @param [recursiveGroupLayoutAlgorithm] the layout algorithm that is applied in each recursion step
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23TemporaryGroupDescriptor-constructor-TemporaryGroupDescriptor">Online Documentation</a>
 * 
 * @property parent
 * Gets or sets the [parent group][TemporaryGroupDescriptor] of this temporary group.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23parent">Online Documentation</a>
 * 
 * @property recursiveGroupLayoutAlgorithm
 * Gets or sets the [layout algorithm][ILayoutAlgorithm] that is considered by the [RecursiveGroupLayout] when arranging the nodes belonging to this temporary group.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23recursiveGroupLayoutAlgorithm">Online Documentation</a>
 */
external open class TemporaryGroupDescriptor  (
open var parent: TemporaryGroupDescriptor? = definedExternally,
open var recursiveGroupLayoutAlgorithm: ILayoutAlgorithm? = definedExternally) : YObject {

/**
 * Gets the [bounds][YRectangle] of this temporary group.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23computedBounds">Online Documentation</a>
 */
open val computedBounds: YRectangle?
/**
 * Gets or sets the [halo][NodeHalo] of this temporary group or `null` if the group has no halo.
 * 
 * Default value - `null`. The temporary group has no halo.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23halo">Online Documentation</a>
 */
open var halo: NodeHalo?
/**
 * Gets or sets the [insets][YInsets] of this temporary group or `null` if the group has no insets.
 * 
 * Default value - `null`. The temporary group has no insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23insets">Online Documentation</a>
 */
open var insets: YInsets?
/**
 * Gets or sets the [minimum size][YDimension] of this temporary group or `null` if the group has no minimum size constraint.
 * 
 * Default value - `null`. The temporary group has no minimum size constraint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23minimumSize">Online Documentation</a>
 */
open var minimumSize: YDimension?

companion object : ClassMetadata<TemporaryGroupDescriptor> {
}
}

inline fun TemporaryGroupDescriptor(
    block: TemporaryGroupDescriptor.() -> Unit
): TemporaryGroupDescriptor {
    return TemporaryGroupDescriptor()
        .apply(block)
}
