// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

/**
 * Specifies how port locations should be adjusted after a layout has been calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy">Online Documentation</a>
 */

sealed external class PortAdjustmentPolicy {
  /**
   * Port locations should not be adjusted at all.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23NEVER">Online Documentation</a>
   */
  object NEVER: PortAdjustmentPolicy
  
  /**
   * Edges at ports are lengthened if their port is [outside][yfiles.styles.IShapeGeometry] of its owner's [outline][yfiles.styles.IShapeGeometry].
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23LENGTHEN">Online Documentation</a>
   */
  object LENGTHEN: PortAdjustmentPolicy
  
  /**
   * Edges at ports are shortened if their port is [inside][yfiles.styles.IShapeGeometry] of its owner's [outline][yfiles.styles.IShapeGeometry].
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23SHORTEN">Online Documentation</a>
   */
  object SHORTEN: PortAdjustmentPolicy
  
  /**
   * Edges at ports are lengthened or shortened if their port is not on its owner's [outline][yfiles.styles.IShapeGeometry].
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortAdjustmentPolicy%23ALWAYS">Online Documentation</a>
   */
  object ALWAYS: PortAdjustmentPolicy
}
