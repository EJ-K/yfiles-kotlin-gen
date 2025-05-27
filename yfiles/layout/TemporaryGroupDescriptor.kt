// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * This class allows specifying temporary groups for nodes that are considered by the [TemporaryGroupInsertionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TemporaryGroupDescriptor] using the given descriptor as parent and the [ILayoutAlgorithm] that is considered by the [RecursiveGroupLayout].
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
 * Gets or sets the [ILayoutAlgorithm] that is considered by the [RecursiveGroupLayout] when arranging the nodes belonging to this temporary group.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23recursiveGroupLayoutAlgorithm">Online Documentation</a>
 */
external class TemporaryGroupDescriptor (
final var parent: TemporaryGroupDescriptor? = definedExternally,
final var recursiveGroupLayoutAlgorithm: ILayoutAlgorithm? = definedExternally)  {
  /**
   * Gets the [bounds][Rect] of this temporary group.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23computedBounds">Online Documentation</a>
   */
  final val computedBounds: Rect
  
  /**
   * Gets or sets the [margins][Insets] of this temporary group.
   * 
   * Default value - [Insets.EMPTY]. The temporary group has no margins.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23margins">Online Documentation</a>
   */
  final var margins: Insets
  
  /**
   * Gets or sets the [minimum size][Size] of this temporary group.
   * 
   * Default value - [Size.EMPTY]. The temporary group has no minimum size constraint.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23minimumSize">Online Documentation</a>
   */
  final var minimumSize: Size
  
  /**
   * Gets or sets the [padding][Insets] of this temporary group.
   * 
   * Default value - [Insets.EMPTY]. The temporary group has no padding.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemporaryGroupDescriptor%23padding">Online Documentation</a>
   */
  final var padding: Insets
  
  companion object : ClassMetadata<TemporaryGroupDescriptor> {
  }
}

inline fun TemporaryGroupDescriptor(
    block: TemporaryGroupDescriptor.() -> Unit
): TemporaryGroupDescriptor {
    return TemporaryGroupDescriptor()
        .apply(block)
}
