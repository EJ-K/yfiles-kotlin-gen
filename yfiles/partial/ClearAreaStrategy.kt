// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy">Online Documentation</a>
 */
external sealed class ClearAreaStrategy: YEnum<ClearAreaStrategy> {
   companion object: EnumMetadata<ClearAreaStrategy> {
       /**
 * A strategy that clears the area by trying to minimize the number of moved nodes, changing the layout rather locally.
 * 
 * Value - `0`
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy%23LOCAL">Online Documentation</a>
 */
val LOCAL: ClearAreaStrategy

/**
 * A strategy that clears the area by trying to minimize the number of moved nodes, changing the layout rather locally but moving all necessary nodes by a uniform offset.
 * 
 * Value - `1`
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy%23LOCAL_UNIFORM">Online Documentation</a>
 */
val LOCAL_UNIFORM: ClearAreaStrategy

/**
 * A strategy that clears the area with the goal to preserve the shape of the existing edge paths, moving related elements in common.
 * 
 * Value - `2`
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy%23PRESERVE_SHAPES">Online Documentation</a>
 */
val PRESERVE_SHAPES: ClearAreaStrategy

/**
 * A strategy that clears the area with the goal to preserve the shape of the existing edge paths, moving related elements in common and also moving all elements by a uniform offset.
 * 
 * Value - `3`
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy%23PRESERVE_SHAPES_UNIFORM">Online Documentation</a>
 */
val PRESERVE_SHAPES_UNIFORM: ClearAreaStrategy

/**
 * A strategy that clears the area by globally partitioning the input into two parts and moving them apart.
 * 
 * Value - `4`
 * @see [ClearAreaLayout.clearAreaStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaStrategy%23GLOBAL">Online Documentation</a>
 */
val GLOBAL: ClearAreaStrategy
   }
}
