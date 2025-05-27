// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Specifies how port locations should be adjusted after a layout has been calculated.
 * @see [LayoutGraphAdapter.portAdjustmentPolicy]
 * @see [LayoutExecutor.portAdjustmentPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy">Online Documentation</a>
 */
external sealed class PortAdjustmentPolicy: YEnum<PortAdjustmentPolicy> {
   companion object: EnumMetadata<PortAdjustmentPolicy> {
       /**
 * Port locations should not be adjusted at all.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23NEVER">Online Documentation</a>
 */
val NEVER: PortAdjustmentPolicy

/**
 * Edges at ports are lengthened if their port is [outside][yfiles.styles.IShapeGeometry.isInside] of its owners [outline][yfiles.styles.IShapeGeometry.getOutline].
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23LENGTHEN">Online Documentation</a>
 */
val LENGTHEN: PortAdjustmentPolicy

/**
 * Edges at ports are shortened if their port is [inside][yfiles.styles.IShapeGeometry.isInside] of its owners [outline][yfiles.styles.IShapeGeometry.getOutline].
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23SHORTEN">Online Documentation</a>
 */
val SHORTEN: PortAdjustmentPolicy

/**
 * Edges at ports are lengthened or shortened if their port is not on its owners [outline][yfiles.styles.IShapeGeometry.getOutline].
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: PortAdjustmentPolicy
   }
}
