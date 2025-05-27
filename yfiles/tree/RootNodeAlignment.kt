// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import js.array.ReadonlyArray
import yfiles.algorithms.Rectangle2D
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [RootNodeAlignment] describes how a local root node is arranged in relation to its children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment">Online Documentation</a>
 */
external abstract class RootNodeAlignment  : YObject {

/**
 * Moves the shape of the local root to a suitable position relative to the children's shapes.
 * @param [rootShape] the shape of the local root node that will be moved
 * @param [shapes] a list of rotated subtree shapes, representing the shapes of the child nodes
 * @param [shapeBounds] accumulated bounds of the shapes of all child nodes
 * @param [spacing] the spacing value that should be used
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23RootNodeAlignment-method-placeParentHorizontal">Online Documentation</a>
 */
 abstract protected   fun placeParentHorizontal( rootShape: RotatedSubtreeShape ,
 shapes: IList<out RotatedSubtreeShape> ,
 shapeBounds: Rectangle2D ,
 spacing: Double )

companion object : ClassMetadata<RootNodeAlignment> {
/**
 * An array containing all supported [RootNodeAlignment]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23ALL">Online Documentation</a>
 */
 val ALL: ReadonlyArray<RootNodeAlignment>
/**
 * Horizontal [RootNodeAlignment] at the center of the subtrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23CENTER">Online Documentation</a>
 */
 val CENTER: RootNodeAlignment
/**
 * Horizontal alignment at the center of the children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23CENTER_OVER_CHILDREN">Online Documentation</a>
 */
 val CENTER_OVER_CHILDREN: RootNodeAlignment
/**
 * Horizontal [RootNodeAlignment] left of the children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23LEADING">Online Documentation</a>
 */
 val LEADING: RootNodeAlignment
/**
 * Horizontal [RootNodeAlignment] at the left side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23LEFT">Online Documentation</a>
 */
 val LEFT: RootNodeAlignment
/**
 * Horizontal [RootNodeAlignment] at the median child node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23MEDIAN">Online Documentation</a>
 */
 val MEDIAN: RootNodeAlignment
/**
 * Horizontal [RootNodeAlignment] at the right side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23RIGHT">Online Documentation</a>
 */
 val RIGHT: RootNodeAlignment
/**
 * Horizontal [RootNodeAlignment] right of the children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23TRAILING">Online Documentation</a>
 */
 val TRAILING: RootNodeAlignment
/**
 * Calculates the common bounds of the given subtree shapes.
 * @param [shapes] a list of rotated subtree shapes
 * @return the rectangle describing the bounds containing all given shapes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootNodeAlignment%23RootNodeAlignment-method-getBounds">Online Documentation</a>
 */
 final protected   fun getBounds( shapes: IList<out RotatedSubtreeShape> ):Rectangle2D
}
}
