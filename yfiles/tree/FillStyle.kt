// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [AspectRatioNodePlacer.fillStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillStyle">Online Documentation</a>
 */
external sealed class FillStyle: YEnum<FillStyle> {
   companion object: EnumMetadata<FillStyle> {
       /**
 * Style specifier which defines that rows/columns are aligned with their leading side.
 * 
 * Value - `1`
 * @see [AspectRatioNodePlacer.fillStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillStyle%23LEADING">Online Documentation</a>
 */
val LEADING: FillStyle

/**
 * Style specifier which defines that rows/columns are aligned with their trailing side.
 * 
 * Value - `2`
 * @see [AspectRatioNodePlacer.fillStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillStyle%23TRAILING">Online Documentation</a>
 */
val TRAILING: FillStyle

/**
 * Style specifier which defines that rows/columns are justified to have the same width/height.
 * 
 * Value - `3`
 * @see [AspectRatioNodePlacer.fillStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillStyle%23JUSTIFY">Online Documentation</a>
 */
val JUSTIFY: FillStyle

/**
 * Style specifier which defines that rows/columns are aligned with their center.
 * 
 * Value - `4`
 * @see [AspectRatioNodePlacer.fillStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillStyle%23CENTERED">Online Documentation</a>
 */
val CENTERED: FillStyle
   }
}
